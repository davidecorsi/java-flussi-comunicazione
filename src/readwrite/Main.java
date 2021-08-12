package readwrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader brd = new BufferedReader(new FileReader(args[0]));
		BufferedWriter bwt = new BufferedWriter(new FileWriter(args[1]));
		
		String line;
		
		while((line = brd.readLine()) != null) {
			bwt.write(line);
			bwt.newLine();
		}
		bwt.close();
		brd.close();
	}
}
