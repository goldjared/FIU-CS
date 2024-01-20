package train;

public class PassengerTrain {
private String[][] trainSeatArr;
private int availableSeats;

private int trainID = 0;
final int rows = 5;
final int cols = 4;


public PassengerTrain() {
	// increment the train ID (for the case of having multiple train carts)
	trainID++;
	this.trainSeatArr = new String[rows][cols];
	this.availableSeats = rows * cols;
	
	// loop initializes each row to contain correct lettering
	for (int i = 0; i < rows; i++) {
		this.trainSeatArr[i] = new String[]{"A", "B", "C", "D"};
	}
}

public boolean isSeatAvailable(int row, int col) {
	// check if the seat selection is valid, throw error if not
	if (row > rows || row < 0 || col < 0 || col > cols) throw new IllegalArgumentException("Invalid seat selection.");
	// if the train seat location in the 2d array does not equal X, return true for available spot
	return !trainSeatArr[row][col].equals("X");
}

public boolean isTrainFull() {
	return availableSeats == 0;
}

public void assignSeat(int row, int col) throws Exception {
	if (!isSeatAvailable(row, col)) throw new Exception("Seat not available.");
	trainSeatArr[row][col] = "X";
	availableSeats--;
}

public void displaySeatPattern() {
	System.out.println("Train " + trainID + " Seat Pattern");
	for (int i = 0; i < rows; i++) {
		System.out.print(i + 1 + " ");
		for (String value : trainSeatArr[i]) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
}

// main for debug purposes
public static void main(String[] args) {

}
}
