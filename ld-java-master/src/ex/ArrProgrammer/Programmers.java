package ex.ArrProgrammer;

import java.security.KeyStore.TrustedCertificateEntry;
import java.util.Scanner;

public class Programmers {
	public static void main(String[] args) {

		String progName[] = { "Mark", "Kevin", "Roberto", "Loyce", "Rhys" };
		int progID[] = { 101, 102, 102, 104, 105 };
		boolean dbKnowledge[] = { true, true, false, false, true };
		Scanner scanner = new Scanner(System.in);

		
			System.out.println("List of programmers who knows DB.");
			
			for (int i = 0; i < dbKnowledge.length; i++) {
				boolean search;
				search = dbKnowledge[i];
				if (search == true) {
					System.out.println("\nProgrammer ID: " + progID[i] + "\nProgrammer Name: " + progName[i]);
				}
			}

	}
}
