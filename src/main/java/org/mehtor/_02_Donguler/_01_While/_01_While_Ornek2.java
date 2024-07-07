package org.mehtor._02_Donguler._01_While;
/*
Kullanıcıdan alınan sayıların toplamını hesaplayan bir java programı yazın.( Kullanıcı 0 girene kadar program çalışmaya devam etsin.)
 */

import java.util.Scanner;

public class _01_While_Ornek2 {
	public static void main(String[] args) {
		System.out.println("bir deger giriniz: ");
		Scanner sc = new Scanner(System.in);
		int sayi = sc.nextInt();
		int toplam=0;
		
		while(sayi!=0){
			System.out.println("bir deger giriniz: ");
			sayi = sc.nextInt();
			toplam+=toplam+sayi;
		}
		System.out.println("toplam: "+toplam);
		
	}
}