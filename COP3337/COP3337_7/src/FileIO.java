import java.io.*;

public class FileIO {
	public static void main(String[] args) throws IOException {
		File mainFile = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		boolean fileFound = false;
		while (!fileFound) {
			System.out.println("Input name of file e.g. 'file.txt'");
			reader = new BufferedReader(new InputStreamReader(System.in));
			String fileName = reader.readLine();
			
			mainFile = new File(fileName);
			if (!mainFile.exists()) {
				System.out.println("File name: '" + fileName + "' does not exist");
				continue;
			}
			fileFound = true;
		}
		try {
			writer = new BufferedWriter(new FileWriter("temp.txt"));
			String line;
			reader = new BufferedReader(new FileReader("file.txt"));
			while ((line = reader.readLine()) != null) {
				int lineLen = line.length();
				String sentence = "";
				for (int i = 0; i < lineLen; i++) {
					char l = line.charAt(i);
					if (l != '.') {
						sentence = sentence + l;
					} else {
						System.out.println(sentence);
						writer.write(sentence.trim());
						writer.newLine();
						sentence = "";
					}
				}
				writer.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Copying the contents of temp file to original file
		try {
			writer = new BufferedWriter(new FileWriter("file.txt"));
			String line;
			reader = new BufferedReader(new FileReader("temp.txt"));
			while ((line = reader.readLine()) != null) {
				writer.write(line);
				writer.newLine();
			}
			
			writer.close();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
