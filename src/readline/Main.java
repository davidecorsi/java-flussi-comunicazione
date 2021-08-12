package readline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileReader frd = new FileReader(args[0]);
		BufferedReader brd = new BufferedReader(frd);
		// BufferedReader brd = new BufferedReader(new FileReader(args[0])); forma abbreviata
		String line;
		while((line = brd.readLine()) != null) {
			System.out.print(line);
		}
		
		brd.close();
		frd.close();
	}
}
