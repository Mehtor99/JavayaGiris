package org.mehtor._00_Degiskenler;

public class DonusumlerHazirMetodlarla {
	public static void main(String[] args) {
		//String >> int dönüşümü:
		String metin = "150";
		Integer sayi = Integer.parseInt(metin);
		System.out.println(sayi);
		
		//int >> String dönüşümü:
		int sayi2 = 150;
		String metin2 = String.valueOf(sayi2);
		System.out.println(metin2);
		
		//karekök alma
		double sqrt = Math.sqrt((5*5)-(4*4));
		System.out.println(sqrt);
		//
		double random = Math.random();  //herhangi farklı bir işlem yapılmadığı taktirde 0-1 arasi bir sayi dondurur.
		System.out.println(random);
		
		// round metodu en yakın tam sayıya yuvarlar.
		int round = Math.round(13.4f);
		System.out.println(round);
		long round1 = Math.round(10.5);
		System.out.println(round1);
		
	}
}