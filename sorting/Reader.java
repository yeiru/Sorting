package sorting;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Reader {
	
	private Scanner reader;

	public Reader(String filePath) {
		try {
			File file = new File(filePath);
			reader = new Scanner(file);
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found. "+filePath);
		}
	}

	public boolean hasInt() {
		return reader.hasNextInt();
	}

	public int nextInt() {
		return reader.nextInt();
	}
}