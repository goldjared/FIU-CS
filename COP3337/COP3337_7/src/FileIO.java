import java.io.*;

public class FileIO {
	public static void main(String[] args) throws IOException {
		File f = null;
		BufferedReader reader = null;
		boolean fileFound = false;
		while (!fileFound) {
			System.out.println("Input name of file e.g. 'file.txt'");
			reader = new BufferedReader(new InputStreamReader(System.in));
			String fileName = reader.readLine();
			
			f = new File(fileName);
			if (!f.exists()) {
				System.out.println("File name: '" + fileName + "' does not exist");
				continue;
			}
			fileFound = true;
		}
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("temp.txt"));
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
						writer.write(sentence);
						writer.newLine();
						sentence = "";
					}
				}
				writer.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
