package org.mehtor._02_Donguler._01_While;

import java.util.Scanner;

public class _02_While_Ornek3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sayi;
		int toplam = 0;
		System.out.println("Bir sayi giriniz(0 a basarak sonlandirabilirsiniz)");
		while((sayi = sc.nextInt()) != 0){
			toplam = toplam+ sayi;
		} System.out.println("toplam: "+toplam);
	}
}