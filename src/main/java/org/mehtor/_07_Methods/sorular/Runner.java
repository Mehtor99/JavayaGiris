package org.mehtor._07_Methods.sorular;

import java.util.Arrays;

public class Runner {
	public static void main(String[] args) {
		Metodlar metodlar = new Metodlar();
		Denemeler denemeler = new Denemeler();
		int[]ornekDizi ={5,10,15,25,20};
		double ortalama = metodlar.ortalamaHesapla(ornekDizi);
		System.out.println(ortalama);
	
		//soru1
		double ortalama2 = metodlar.ortalamaHesapla(new int[]{5,10});
		System.out.println("Ortalama2: "+ortalama2);
		System.out.println("#############################################");
		//soru2
		int sayi1 =10;
		int sayi2 =13;
		boolean tekMi1 = metodlar.tekMi(sayi1);
		boolean tekMi2 = metodlar.tekMi(sayi2);
		System.out.println(tekMi1+"\n"+tekMi2);
		System.out.println("#############################################");
		//soru3
		int[] siralanmisDizi = metodlar.siraliDizi(ornekDizi);
		System.out.println("siralanmisDizi : "+ Arrays.toString(siralanmisDizi)); //bir diziyi sout içinde bu
		// şekilde yazdırmazsan konsoldan sadece referans adresini okursun.
		
		//soru4 üs hesaplama
		System.out.println(metodlar.usluDeger(5,3));  //125
		System.out.println("#############################################");
		//Soru5
		String metin = "Bugun hava cok guzel";
		String[]kelimeler = metodlar.metindekiKelimeleriBul(metin);
		System.out.println(Arrays.toString(kelimeler));
		
		String kelimeTersi = metodlar.kelimeTersiBul(kelimeler);
		System.out.println(kelimeTersi);
		
		System.out.println("#############################################");
		//soru 6 asalMi
		System.out.println(metodlar.asalMi(1));
		System.out.println(metodlar.asalMi(2));
		System.out.println(metodlar.asalMi(11));
		System.out.println(metodlar.asalMi(9973));
		
		System.out.println("#############################################");
		//Soru8 en buyuk sayilar
		int[]ornekDizi2 ={5,17,11,15,20};
		int[] enBuyuk3Sayi = metodlar.enBuyukNSayi(ornekDizi2,3);
		System.out.println(Arrays.toString(enBuyuk3Sayi));
		
		System.out.println("#############################################");
		//Soru12. kucukHarfSay Usage:
		System.out.println(Character.isLowerCase('b'));
		String metin2 = "USA'da hava cok Guzel";
		System.out.println("kucukHarfSayisi: "+metodlar.kucukHarfSay(metin2));
		System.out.println("buyukHarfSayisi: "+metodlar.buyukHarfSay(metin2));
		
	}
}