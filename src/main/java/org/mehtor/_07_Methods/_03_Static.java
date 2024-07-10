package org.mehtor._07_Methods;

import java.util.Scanner;

// static field veya metodlar sınıfa bağlıdır.
// non-static field veya metodlar nesneye bağlıdır.
public class _03_Static {
	
	int sayi1 = 10;//non static field
	static int sayi2 = 20; //static field
	
	public void selam(){ //non-static metod
		System.out.println("Selam");
	}
	
	public static void merhaba(){
		System.out.println("Merhaba");
	}
	
}


class DenemeStatic {
		public static void main(String[] args) {
			//non-static fieldlara erişmek için önce sınıftan bir nesne üretmek gereklidir.
			_03_Static obj = new _03_Static();
			System.out.println(obj.sayi1);
			//non-static metodlara erişmek için önce sınıftan bir nesne üretmek gereklidir.
			obj.selam();
			
			
			//static fieldlara erişmek için sadece Sınıf adını yazmak yeterlidir. Nesne oluşturmaya gerek yoktur.
			_03_Static.merhaba();
			
			/*
		_03_Static.selam(); //Non-static method 'selam()' cannot be referenced from a static context
		_03_Static.sayi1; //Non-static field 'sayi1' cannot be referenced from a static context
		*/
			
			System.out.println(Math.PI); //Math sınıfı içindeki PI field'ı static olduğu için direkt olarak sınıftan
			// erişim sağlanabiliyor.
			
			Scanner sc = new Scanner(System.in);
			sc.nextInt(); //nesne üzerinden nextInt metoduna erişebildik. Sınıf üzerinden erişim sağlanamaz. Çünkü
			// non-static bir metoddur.
			
			
		}
}