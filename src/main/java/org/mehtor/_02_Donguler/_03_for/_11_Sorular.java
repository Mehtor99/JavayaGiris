package org.mehtor._02_Donguler._03_for;

import java.util.Scanner;

/**
 // Çalışma Sorusu 1:Kullanıcıdan alınan sayı kadar satıra sahip yıldız karakteri ile eşkenar ucgen çizen programı for ile yazın.
 
 Üçgen boyutu:3
   *
  ***
 *****
 
 // Çalışma Sorusu 2: Kullanıcıdan alınan sayı kadar satıra sahip yıldız karakteri ile TERS eşkenar ucgen çizen programı for ile yazın.
 Üçgen boyutu:3
 *****
  ***
   *
 
 // Çalışma Sorusu 3: Aşağıdaki şekli veren programı for döngüleri ile yazınız.
 *
 *
 **
 *
 **
 ***
 *
 **
 ***
 ****
 
 */

public class _11_Sorular {
	public static void main(String[] args) {
		//1
		
		Scanner sc = new Scanner(System.in);
		System.out.println("eskenar ucgen icin boyut değeri giriniz: ");
		int boyut = sc.nextInt();
		int boyutTemp = boyut;
		
		String yildiz = "*";
		for (int i = 0; i < boyut; i++) {           //satir sayisi
			for (int j = boyutTemp - 1; j > 0; j--) { //herbir satırdaki bosluk sayisi icin
				System.out.print(" ");
			}
			boyutTemp--;                       //her bir satirdaki bosluk sayisini 1 azaltmak icin
			System.out.println(yildiz);
			yildiz +=
					"**";                      //**ları sonda ekleme sebebimiz ilk satirda tek yildiz olmasını sağlayabilmek
			
		}
		System.out.println("##########################################################");
		
		//2
		System.out.print("ters eskenar ucgen icin boyut değeri giriniz:  ");
		int boyut1 = sc.nextInt();
		
		for (int i = boyut1; i >= 0; i--) {
			for (int j = boyut1; j > i; j--) {
				System.out.print(" ");
			}
			for (int j1 = 0; j1 < 2 * i - 1; j1++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("##########################################################");
		
		//3
		System.out.print("Oruntu kaca kadar devam etsin :  ");
		int boyut3 = sc.nextInt();
		
		
		for (int i = 1; i <= boyut3; i++) {     //boyut değeri kadar döngü sağlıyor
			for (int j = 0; j < i; j++) {      //i nin o anki değerine göre kaç ssatır yazılacağını belirliyor
				for (int k = 0; k <= j; k++) {  //satırda kaç * olacak burada belirleniyor
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		
	}
}