package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		// Define file(path) to read
		String filename = "C:\\Users\\Reid Bachman\\Files\\FileToRead.txt";
		String text = null; 
		File file = new File(filename);
		BufferedReader br;
		try {
			br =new BufferedReader(new FileReader(file));
			
			text = br.readLine();
			
			br.close();
		} catch (FileNotFoundException e){
			System.out.println("ERROR: File not found: " + filename);
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR: Could not read data: " + filename);
			e.printStackTrace();
		} finally {
			System.out.println("Finished reading the file.");
		}
		System.out.println(text);
	}
}
