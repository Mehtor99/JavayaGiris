package org.mehtor._02_Donguler._03_for;
//Kullanıcıdan alınan sayı kadar satır ve sütuna sahip yıldız karakteri ile SAĞA YASLI dik ucgen çizen programı for ile yazın.
/*
Beklenen çıktı:

Boyut girin: 4
   *       1. satır 3 boşluk 1 yıldız
  **       2. satır 2 boşluk 2 yıldız
 ***       3. satır 1 boşluk 3 yıldız
****       4. satır 0 boşluk 4 yıldız
 */

import java.util.Scanner;

public class _10_For_Ucgen3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ucgen boyutu giriniz: ");
		int boyut = sc.nextInt();
		
		System.out.println("#####################################");
		String yildiz="";
		for (int i = 0; i < boyut; i++) { //satır sayısına kadar döngü
			for (int j = boyut-1; j >i ; j--) { // ilk iterasyonda 4 tane boşluk. 2.iterasyonda 3 boşluk, 3.iterasyonda 2 boşluk
				System.out.print(" ");
			}
			yildiz+="*";
			System.out.println(yildiz);
		}
		
		System.out.println("#####################################");
		
		yildiz="";
		for (int i = 0; i < boyut; i++) { //satır sayısına kadar döngü
			for (int j = 1; j <boyut-i ; j++) {
				System.out.print(" ");
			}
			yildiz+="*";
			System.out.println(yildiz);
		}
		
		System.out.println("#####################################");
		yildiz="";
		for (int i = 0; i < boyut; i++) { //satır sayısına kadar döngü
			for (int j = 1; j <boyut-i ; j++) {
				System.out.print(" ");
			}
			yildiz+="*";
			System.out.println(yildiz);
		}
		
	}
	}