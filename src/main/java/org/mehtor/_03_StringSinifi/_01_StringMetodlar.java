package org.mehtor._03_StringSinifi;

import javax.sound.midi.Soundbank;
import java.util.Locale;

public class _01_StringMetodlar {
	public static void main(String[] args) {
		//01. length(): String değerin karakter sayisini verir.
		String s1 = "Hello world";
		
		System.out.println(s1.length());
		
		int uzunluk = s1.length();
		System.out.println(uzunluk);
		
		String s2 = "";
		System.out.println(s2.length());
		
		//02 charAt(int index) : Stringde belirtilen indexteki karakteri döndürür. index değerleri 0dan başlar ve
		// uzunluğun 1 eksiğine kadar devam eder.
		//           01234
		String s3 = "hello";
		s3.charAt(2);
		System.out.println(s3.charAt(2));
		//ilk karakteri almak için 0 gireriz
		//son karakteri almak için:  length()-1 kullanırız
		System.out.println("Son karakter: "+s3.charAt(s3.length()-1));
		
		//03. substring : Belirtilen indexteki karakterden başlayarak sona kadar(veya belirtilen son indexe kadar) olan Stringi geri döner
		String str = "Merhaba Dunya";
		str.substring(8);
	 	System.out.println(str.substring(8));  // Bu kullanımda verilen beginIndex değeri dahildir.(inclusive)
		
		System.out.println("substring(0,3): "+str.substring(0,3)); //bu kullanımda verilen end index değeri hariçtir(exclusive)
		//sonkarakteri alalım
		System.out.println(str.substring(str.length()-1));  //length:13 sonIndex:12
		
	   	//04. concat(String str): Stringe belirli bir stringi ekleyerek yeni bir string değre oluşturur.
		str="Merhaba";
		String concat = str.concat("Bişeyler"); // yani sonucu değişkende de tutabiliyoruz.
		System.out.println(str.concat(" Java15"));
		
		//05. indexOf
		str ="Merhaba";
		System.out.println(".indexOf('a'): "+str.indexOf('a')); // 4 değerini döndürür.
		System.out.println(".indexOf('a'): "+str.indexOf('x'));//aranan karakter bulunamazsa -1 döndürür.
		System.out.println(str.indexOf("haba"));
		//verilen stringdeki 2.a nın hangi indexte olduğunu bulalım:
		int ilkAIndex = str.indexOf('a');
		System.out.println(str.indexOf('a',ilkAIndex+1));
		System.out.println(str.lastIndexOf('h'));   //sondan başlayarak arama yapar. Bulduğu index numarasini döndürür.
		
		//06. equals,equalsIgnoreCase : string ifadelerin eşitliğini kontrol etmek için kullanılır geriye boolean döndürür
		String str1 = "Merhaba";
		String str2 = "merhaba";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		if(str1.equals(str2)){
			System.out.println("kelimeler ayni");
		}else {
			System.out.println("bu kelimeler faklı");
		}
		
		//07. compareTo : ilk karakterden başlayarak karşılaştırma yapar birbirinden farklı olan ilk karekterlerin farkını alır.
		str1 = "Ahmet"; //65
		str2 = "Celal"; //67
		System.out.println(str1.compareTo(str2)); //65-67 =-2
		String str3 = "Zeynep";
		String str4 = "aman";
		System.out.println(str3.compareTo(str4));
		System.out.println(str3.compareToIgnoreCase(str4)); // z=122 a= 97  122-97=25
		
		//08.toUpperCase : tüm harfleri büyük harf yapar
		System.out.println(str1.toUpperCase());
		str1 = "i love istanbul";
		Locale englishLocale = new Locale("en","US");  //bunu yapınca ingilizce karakterlere dikkat ederek işlem yapar.
		System.out.println(str1.toUpperCase(englishLocale));
		
		//09. toLowerCase  : tüm harfleri küçük harf yapar.
		System.out.println(str1.toLowerCase());
		
		//10. trim : Baştaki ve sondaki boşluklari temizler.
		str1="  Merhaba Java   ";
		System.out.println(str1.trim());
		
		//11.replace    //ilk kısma girilen ifadeleri metnin içinde sonraki girilene çevirir
		str1 ="   Merhaba Java   ";
		String replaceString = str1.trim().toLowerCase().replace('a','o');
		System.out.println(replaceString);
		
		//12.contains: içindeki ifadenin metinde olup olmadığını kontrol eder ve boolean döndürür.
		str1 = "Java15";
		System.out.println(str1.contains("a"));   //true
		System.out.println(str1.contains("av"));  //true
		System.out.println(str1.contains("16"));  //false
		
		//13.startsWith, endsWith : içine yazılann ifade ile mi başlayıp bittiğini kontrol eder. true veya false
		// dondurur.
		str1 ="Java15";
		System.out.println(str1.startsWith("Ja"));
		System.out.println(str1.startsWith("av"));
		System.out.println(str1.endsWith("a15"));
		
		//14. Escape Characters:
		System.out.println("Bugün \"Ankarada\" hava yagmurlu");
		System.out.println("Ad \t\t Soyad");
		System.out.println("Mehmet\t Ertop");
		System.out.println("Mehmet\nErtop");
		
		//Soru:
		str1= " Merhaba Dunya ";
		System.out.println(str1.trim().replace(" ","!"));
		System.out.println(str1.replace(" ","!").trim());
	
		
		
	}
}