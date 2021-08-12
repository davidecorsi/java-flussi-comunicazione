package readchar;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileReader frd = new FileReader(args[0]);
		
		int i;
		while((i = frd.read()) != -1) {
			System.out.print((char) i);
		}
		frd.close();
	}
}
