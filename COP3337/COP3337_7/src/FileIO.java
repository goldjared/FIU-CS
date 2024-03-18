import java.io.*;

public class FileIO {
	
	// Main throws IOException for try/catch working with IO
	public static void main(String[] args) throws IOException {
		// Declare member values as null initially, to allow scope of member to be accessed/reused
		File mainFile = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		String fileName = "";
		boolean fileFound = false;
		// While the file is not found, continue loop
		while (!fileFound) {
			System.out.println("Input name of file e.g. 'file.txt'");
			reader = new BufferedReader(new InputStreamReader(System.in));
			fileName = reader.readLine();
			
			mainFile = new File(fileName);
			if (!mainFile.exists()) {
				System.out.println("File name: '" + fileName + "' does not exist");
				continue;
			}
			// Exit loop
			fileFound = true;
		}
		// Starting string for temp file name
		StringBuilder tempName = new StringBuilder("temp");
		// Counter to ensure unique suffix for temp file name
		int counter = 0;
		// Set File to null, for reuse purposes
		File tempF = null;
		// While the tempFile is existing, inc the counter val until the tempFile name does not exist
		while (fileFound) {
			// Set tempFile to the unique tempFile name, check if exists, if so, change int value
			tempF = new File(tempName.toString() + counter + ".txt");
			if (tempF.exists()) {
				// Add int value to tempName, to ensure uniqueness
				counter++;
				continue;
			}
			tempName.append(counter).append(".txt");
			// Exit loop
			fileFound = false;
		}
		try {
			// Try/catch for setting writer to temp file, and reader to original file
			writer = new BufferedWriter(new FileWriter(tempName.toString()));
			String line;
			reader = new BufferedReader(new FileReader(fileName));
			// Loop runs while the BufferedReader read line is not null
			while ((line = reader.readLine()) != null) {
				int lineLen = line.length();
				String sentence = "";
				// Add each char value that is not a '.' to the string, once it hits a '.', write string to file
				for (int i = 0; i < lineLen; i++) {
					char l = line.charAt(i);
					if (l != '.') {
						sentence = sentence + l;
						continue;
					}
					// Using trim method to remove whitespace
					sentence = sentence.trim();
					// Writing file to current bufferedWriter file (temp file)
					writer.write(sentence);
					writer.newLine();
					sentence = "";
				}
				// Close bufferedWriter
				writer.close();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		// Copying the contents of temp file to original file
		try {
			// Set bufferedWriter to original file, set reader to the created temp file
			writer = new BufferedWriter(new FileWriter(fileName));
			String line;
			reader = new BufferedReader(new FileReader(tempName.toString()));
			while ((line = reader.readLine()) != null) {
				writer.write(line);
				writer.newLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			// Ensure bufferedReader/Writer are closed and temp file is deleted
			try {
				assert writer != null;
				writer.close();
				reader.close();
				tempF.deleteOnExit();
				System.out.println("File: '" + fileName + "' edited successfully!");
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
