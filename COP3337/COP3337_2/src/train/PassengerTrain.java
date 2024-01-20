package train;

public class PassengerTrain {
// Field member values, 2d String array for the train cart
private final String[][] trainSeatArr;
private int availableSeats;
// static trainID for case of multiple train cart instances
private static int trainID = 0;
final int rows = 5;
final int cols = 4;

// Train constructor
public PassengerTrain() {
	// Increment the train ID (for the case of having multiple train instances)
	trainID++;
	// Creates 2d String arr for instance, sets instance availSeats
	this.trainSeatArr = new String[rows][cols];
	this.availableSeats = rows * cols;
	
	// Loop initializes each row in 2d array to contain correct lettering
	for (int i = 0; i < rows; i++) {
		this.trainSeatArr[i] = new String[]{"A", "B", "C", "D"};
	}
}

public boolean isSeatAvailable(int row, int col) {
	// Check if the seat selection is valid, throw error if not
	if (row > rows || row < 0 || col < 0 || col > cols) throw new IllegalArgumentException("Invalid seat selection.");
	// If the train seat location in the 2d array does not equal X, return true for available spot
	return !trainSeatArr[row][col].equals("X");
}

// Returns boolean if the train is full
public boolean isTrainFull() {
	return availableSeats == 0;
}

// Modifies 2d train array setting the targeted value to 'X' for filled.
public void assignSeat(int row, int col) throws Exception {
	// ensure the seat is available
	if (!isSeatAvailable(row, col)) throw new Exception("Seat not available.");
	trainSeatArr[row][col] = "X";
	// Reduces availableSeats by 1.
	availableSeats--;
}

public void displaySeatPattern() {
	System.out.println("Train " + trainID + " Seat Pattern");
	// Outer loop, prints the row numeric identifier
	for (int i = 0; i < rows; i++) {
		System.out.print(i + 1 + " ");
		// Inner enhanced for loop prints each value within the row that iterator 'i' matches
		for (String value : trainSeatArr[i]) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
}

// Main for debug purposes
public static void main(String[] args) {

}
}
