package primitivi;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		PrintWriter pwr = new PrintWriter(new FileWriter(args[0]));
		
		pwr.println(123); // scrivere tipo primitivo
		pwr.println("pippo"); // scrivere oggetto in forma testuale
		pwr.println(3.14);
		pwr.println(true);
		
		pwr.flush(); // forza la scrittura dopo aver caricato tutto su un buffer
		pwr.close();
	}
}
