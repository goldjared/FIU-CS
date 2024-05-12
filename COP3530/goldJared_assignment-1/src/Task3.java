import java.util.Scanner;

public class Task3 {
	public static int sabaScan(char[][] grid) {
		int n = grid.length;
		int m = grid[0].length;
		int count = 0;
		
		// horizontal
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m - 3; j++) {
				if (grid[i][j] == 's' && grid[i][j + 1] == 'a' && grid[i][j + 2] == 'b' && grid[i][j + 3] == 'a') {
					count++;
				}
			}
		}
		
		// vertical
		for (int i = 0; i < n - 3; i++) {
			for (int j = 0; j < m; j++) {
				if (grid[i][j] == 's' && grid[i + 1][j] == 'a' && grid[i + 2][j] == 'b' && grid[i + 3][j] == 'a') {
					count++;
				}
			}
		}
		
		// diagonal upper L to lower R
		for (int i = 0; i < n - 3; i++) {
			for (int j = 0; j < m - 3; j++) {
				if (grid[i][j] == 's' && grid[i + 1][j + 1] == 'a' && grid[i + 2][j + 2] == 'b' && grid[i + 3][j + 3] == 'a') {
					count++;
				}
			}
		}
		
		// diagonal bottom L to upper R
		for (int i = 3; i < n; i++) {
			for (int j = 0; j < m - 3; j++) {
				if (grid[i][j] == 's' && grid[i - 1][j + 1] == 'a' && grid[i - 2][j + 2] == 'b' && grid[i - 3][j + 3] == 'a') {
					count++;
				}
			}
		}
		
		return count;
	}
	
	public static void printGrid(char[][] grid) {
		for (char[] row : grid) {
			for (char cell : row) {
				System.out.print(cell + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int m = 0;
		char[][] grid;
		System.out.print("Type 'y' to use default test case, type 'n' to enter input: "
		);
		String choice = sc.next().toLowerCase();
		
		// use default test case, omits user input request
		if (choice.equals("y")) {
			System.out.println("Using default test case...");
			grid = new char[][]{
							{'s', 'a', 'b', 'a', 'c'},
							{'d', 'a', 's', 'a', 'b'},
							{'a', 'c', 'b', 'b', 'a'},
							{'z', 'f', '3', 'a', 'c'},
							{'s', 'a', 'b', 'a', 'c'},
			};
			n = grid.length;
			m = grid[0].length;
		} else {
			
			System.out.println("Enter n rows and m cols where (1 <= 𝑛, 𝑚 <= 100)");
			
			System.out.print("Enter n (rows): ");
			while (!sc.hasNextInt()) {
				System.out.print("Enter n (rows): ");
				sc.next();
			}
			n = sc.nextInt();
			
			System.out.print("Enter m (cols): ");
			while (!sc.hasNextInt()) {
				System.out.print("Enter m (cols): ");
				sc.next();
			}
			m = sc.nextInt();
			// grid initialization
			grid = new char[n][m];
			System.out.println("Enter n (" + n + ") grid lines of m (" + m + ") length in format E.g: 'abcde' ENTER, 'kitty' ENTER, ...:");
			for (int i = 0; i < n; i++) {
				String row = sc.next();
				grid[i] = row.toCharArray();
			}
		}
		
		sc.close();
		int occurrences = sabaScan(grid);
		printGrid(grid);
		System.out.println("'saba' appears " + occurrences + " times");
	}
}
