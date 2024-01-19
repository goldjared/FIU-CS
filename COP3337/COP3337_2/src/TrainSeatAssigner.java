import java.util.Scanner;

public class TrainSeatAssigner {
	private String[][] trainSeatArr;
	
	private int trainID = 0;
	int rows;
	final int cols = 4;
	
	final String[] seatLetters = {"A", "B", "C", "D"};
	
	public TrainSeatAssigner(int rowVal) {
		this.rows = rowVal;
		this.trainID++;
		this.trainSeatArr = new String[rows][cols];
		for(int i = 0; i < rows; i++) {
				this.trainSeatArr[i] = seatLetters;
		}
	}
	
	public boolean isSeatTaken(int row, char letter) {
		// get ASCII value of letter, subtract A val + 1 to convert to 26 digits
		int letterAscii = (int) letter - 'A' + 1;
//		if(row > rows || row < rows || letterAscii > cols || letterAscii < cols )
		return trainSeatArr[row-1][letterAscii].equals("X");
	}
	
	public void assignSeat(int row, String col) {
		char colToChar = col.charAt(0);
	}
	
	public void displaySeatPattern() {
		System.out.println("Train " + trainID + " Seat Pattern");
		for(int i = 0; i < rows; i++) {
			System.out.print(i+1 + " " );
			for(int j = 0; j < cols; j++) {
				System.out.print(trainSeatArr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		TrainSeatAssigner test = new TrainSeatAssigner(5);
		// print base seat pattern, empty train
		test.displaySeatPattern();
		System.out.println(test.isSeatTaken(1, 'B'));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("**Valid inputs: Row 1-5, Col A-D**");
		System.out.println("Enter seat location in row/col format (e.g.: C3): ");
		String seatPos = sc.nextLine();
		
	}
}
