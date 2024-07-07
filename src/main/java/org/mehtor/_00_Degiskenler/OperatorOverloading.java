package org.mehtor._00_Degiskenler;

public class OperatorOverloading {
	public static void main(String[] args) {
		// Overload: Aşırı Yükleme : Birden fazla kullanım özelliği kazandırma.
		int sonuc = 5+3;
		System.out.println(sonuc);
		
		System.out.println(10+20);     // + operatörü sayılarla toplama işlemi yapar.
		
		System.out.println("Deneme"+10); // + operatörü eğer 1 tane string bile varsa birleştirme işlemi yapar.
		System.out.println("Deneme"+"Iki"); // + operatörü eğer 1 tane string bile varsa birleştirme işlemi yapar.
		System.out.println(10+"Iki"); // + operatörü eğer 1 tane string bile varsa birleştirme işlemi yapar.
		
		//System.out.println(true+10); // + operatörü booleanlarla kullanılamaz.
		char a = 97;
		System.out.println(a); //a
		a++;
		System.out.println(a);
		System.out.println(a+2);
		System.out.println(a+1);
		
		for (char i = 0; i<255;i++){
			System.out.println((int)i+"->"+i);
		}
		
		int harf= 97;
		System.out.println((char)harf+" "+harf);
	}
}