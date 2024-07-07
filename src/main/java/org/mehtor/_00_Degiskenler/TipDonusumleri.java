package org.mehtor._00_Degiskenler;

public class TipDonusumleri {
	public static void main(String[] args) {
		int x=20;
		long l = x;//int 32bit, long 64bit.
		System.out.println(l);
		
		byte b=10;
		short s=b; //byte 8bit, short 16bit.
		int intSayi=b;
		System.out.println(s);
		
		float f=10.25f;
		double d=f; //float 32bit, double 64bit
		System.out.println(d);
		
		long longDeger=Long.MAX_VALUE;
		System.out.println(longDeger);
		float floatDeger=longDeger;
		System.out.println(floatDeger);
		
		long longDeger2 = 10L+Integer.MAX_VALUE;
		System.out.println(longDeger2);
		
		double d1 = Double.MAX_VALUE;
		System.out.println(d1);
		float f1= (float)d1; // Double 64bit. Float 32bit. Otomatik dönüşüm olamaz.
		System.out.println(f1);
		
		int i1=10;
		double d2=5.5;
		System.out.println(i1+d2); //iki değişkenden biri double ise double döndüürüyor.
		
		int sayi;
		double y=9.99;
		sayi=(int)y;
		System.out.println(sayi);
		
		int a=2_000_000_000;
		char ch= (char) a;
		System.out.println(ch);
	}
}