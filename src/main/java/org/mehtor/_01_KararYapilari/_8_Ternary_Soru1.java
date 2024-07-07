package org.mehtor._01_KararYapilari;

import org.w3c.dom.ls.LSOutput;
//Ternary operatirü çok kullanılan birşey değildir çünkü if else kadar kullanışlı ve kolay okunur değildir.
/*
Bir öğrencinin notunu aldığımızda,
notu 50'den büyük veya eşitse "Geçer",
küçükse "Kaldı" şeklinde bir durum göstermek için ternary operatörü kullanılarak programı yazınız.

 */
public class _8_Ternary_Soru1 {
	public static void main(String[] args) {
		
		int not = 40;
		String sonuc =(not<=50)? "Kaldi" : "Gecti"; //soru isaretinden cnceki sart dogru ise ilk kısım calısır
		System.out.println(sonuc);                  //degilse 2.kısım calisir.
		
		int not1 = 32;
		String sonuc1 = (not1 <= 50 && not1 > 0) ? (not1 > 30) ? "DD" : "Kaldı" : "Geçti";
		System.out.println(sonuc1);
	}
	
}