package org.mehtor._04_MathSinifi;

public class _00_MathSinifi {
	public static void main(String[] args) {
		//Math m1 = new Math();  //Math sınıfı constructor'ı private olduğu için nesne oluşturamazsınız.
		
		//1.abs: Mutlak değer döndürür.
		int sayi1 = -5;
		int sayi2 = -10;
		System.out.println(Math.abs(sayi1));
		
		//2.max
		System.out.println(Math.max(sayi2,sayi1));
		//3.min
		System.out.println(Math.min(sayi2,sayi1));
		
		// 3 sayı içinden en küçük olanı Math.min metodu ile nasıl bulabiliriz?
		int sayi3=20;
		System.out.println(Math.min(sayi1, Math.min(sayi2,sayi3)));
		//4.pow : üslü ifade işlemi yapar
		System.out.println(Math.pow(5,3));
		//5.sqrt(square Root Karekök Bulma İşlemi)
		System.out.println(Math.sqrt(25));
		
		//6. Yuvarlama işlemleri
		//6.1 ceil : yukari yuvarlama
		System.out.println(Math.ceil(5.2));
		
		//6.2 floor: Aşağı yuvarlama
		System.out.println(Math.floor(3.7));
		
		//6.3 round : En yakın tam sayiya yuvarlama
		System.out.println(Math.ceil(5.2));
		System.out.println(Math.floor(3.7));
		
		//7.random()
		System.out.println(Math.random());  //0-1 arasi rastgele bir sayi üretir.
		
		
		
	}
}