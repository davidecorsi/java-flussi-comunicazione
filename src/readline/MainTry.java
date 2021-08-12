package readline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MainTry {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BufferedReader brd = null;
		try {
			brd = new BufferedReader(new FileReader(args[0]));
			String line;
			while((line = brd.readLine()) != null) {
				System.out.print(line);
			}
		} catch(IOException e) {
			System.out.println("Errore nella lettura del file " + e);
		} finally {
			try {
				if(brd != null) {
					brd.close();
				}
			} catch(IOException e) {
				System.out.println("Errore nella chiusura del file " + e);
			}
		}
	}
}
