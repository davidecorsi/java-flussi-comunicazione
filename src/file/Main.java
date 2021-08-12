/*
 La classe File fornisce una rappresentazione astratta dei file e una serie di metodi utili per la loro gestione
 */

package file;

import java.io.File;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		System.out.println("Separatore del sistema operativo " + File.separator);
		
		File file = new File(args[0]);
		
		System.out.println("             nome = " + file.getName());
		System.out.println("pathname assoluto = " + file.getAbsolutePath());
		System.out.println("  directory padre = " + new File(file.getAbsoluteFile().getParent()));
		System.out.println("          esiste? = " + file.exists());
		System.out.println("     è leggibile? = " + file.canRead());
		System.out.println("    è scrivibile? = " + file.canWrite());
		System.out.println("       è un file? = " + file.isFile());
		System.out.println(" è una directory? = " + file.isDirectory());
		System.out.println("  ultima modifica = " + new Date(file.lastModified()));
		System.out.println("       dimensione = " + file.length() + " byte");
	}
}
