package org.mehtor._00_Degiskenler;

public class Sabitler {
	public static void main(String[] args) {
		//Değişken kullanımı
		int i=5;
		System.out.println(i);
		
		i=10;
		System.out.println(i);
		
		//sabit kullanimi
		final int b  = 5;   //sabit bu şekilde tanımlanır
		//b ==10;  //HATA!!! sabitin değeri değiştirilemez.
		
		//Math sinifindaki PI kullanımı;
		float r =5f;
		final double DAIRE_CEVRE = 2*Math.PI*r;
		final String MARKA = "EGS";
		System.out.println(MARKA);
		
	}
}