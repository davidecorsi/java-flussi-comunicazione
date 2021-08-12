package readline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MainTryWithResources {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try(BufferedReader brd = new BufferedReader(new FileReader(args[0]))) {
			String line;
			while((line = brd.readLine()) != null) {
				System.out.print(line);
			}
		} catch(IOException e) {
			System.out.println("Errore nella lettura del file " + e);
		}
	}
}
