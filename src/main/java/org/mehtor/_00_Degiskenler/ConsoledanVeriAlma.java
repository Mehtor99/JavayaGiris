package org.mehtor._00_Degiskenler;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoledanVeriAlma {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);      //sc referance olarak kullanılacak.
		
		System.out.println("bir girgi yaziniz:");
		String girdi = sc.next();
		System.out.println("Terminalden alinan deger: "+girdi);
		
		/*System.out.println("ikinci bir girdi yaziniz: ");
		String girdi2 = sc.nextLine();
		System.out.println("Terminalden alinan deger: "+girdi2);
		 */
	}
}