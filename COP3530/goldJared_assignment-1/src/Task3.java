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
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n rows and m cols where (1 <= 𝑛, 𝑚 <= 100)");
		System.out.print("Enter n (rows): ");
		int n = sc.nextInt();
		System.out.print("Enter m (cols): ");
		int m = sc.nextInt();
		
		// grid initialization
		char[][] grid = new char[n][m];
		System.out.println("Enter n (" + n + ") grid lines of m (" + m + ") length in format E.g: 'abcde' ENTER, 'kitty' ENTER, ...:");
		for (int i = 0; i < n; i++) {
			String row = sc.next();
			grid[i] = row.toCharArray();
		}
		
		int occurrences = sabaScan(grid);
		
		System.out.println("'saba' appears " + occurrences + " times");
	}
}
