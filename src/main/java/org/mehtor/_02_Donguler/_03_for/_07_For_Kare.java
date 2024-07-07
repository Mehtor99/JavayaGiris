package org.mehtor._02_Donguler._03_for;

import java.util.Scanner;
/*
Kullanıcıdan alınan sayı kadar satır ve sütuna sahip yıldız karakteri ile kare çizen programı for ile yazın.
Örnek çıktı:
Boyut giriniz:3
***
***
***
 */
public class _07_For_Kare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("kare boyutu giriniz: ");
		int boyut = sc.nextInt();
		String a = "*";
		
		for (int j = 0 ; j<boyut ;j++ ) {
			for (int i = 0; i < boyut; i++) {
				System.out.print(a);
			}
			System.out.println();
		}
	}
}