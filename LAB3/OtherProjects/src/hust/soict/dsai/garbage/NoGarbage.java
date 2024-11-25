package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.*;

public class NoGarbage {

	public static void main(String[] args) throws IOException {
		String filename = "C:\\Users\\DELL\\Desktop\\OOP\\OtherProjects\\src\\hust\\soict\\dsai\\garbage\\test.txt"; 

		byte[] inputBytes = { 0 };

		long startTime, endTime;

		inputBytes = Files.readAllBytes (Paths.get(filename));

		startTime = System.currentTimeMillis(); 
		StringBuilder outputString = new StringBuilder();

		for (byte b: inputBytes) {

			outputString.append((char) b);

		}

		endTime = System.currentTimeMillis();

		System.out.println(endTime - startTime);

	}

}
