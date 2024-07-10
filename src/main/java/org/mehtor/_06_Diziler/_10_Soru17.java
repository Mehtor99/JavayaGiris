package org.mehtor._06_Diziler;

import java.util.Scanner;

/*
Dizideki bir öğeyi arama
5 elemanlı elemanları kullanıcı tarafından girilen bir dizi oluşturun.
kullanıcının girdiği sayı dizide varsa BULUNDU, yoksa BULUNAMADI şeklinde mesaj versin
 */
public class _10_Soru17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] dizi = new int[5];
		
		System.out.println("Dizi elemanlarini giriniz: ");
		for (int i = 0; i < dizi.length; i++) {
			System.out.println((i+1)+".sayiyi giriniz: ");
			dizi[i] = input.nextInt();
		}
		
		System.out.println("Dizide aranacak değeri giriniz: ");
		int aranan = input.nextInt();
		
		//Flag mantiği
		boolean bulunduMu = false;
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i]==aranan){
				bulunduMu = true;
				break;
			}
		}
		if(bulunduMu) {
			System.out.println("BULUNDU - Aranan değer dizide var");
		}else  {
			System.out.println("BULUNAMADI- Aranan değer dizide yok");
		}
		
	}
}