package org.mehtor._03_StringSinifi;
/*
String immutable bir siniftir. Her değişiklik sonucu yeni nesne oluşur.
StringBuilder sınıfı mutable bir siniftir. : Yapilan değişiklikler ilgili nesnede kalir. yeni nesne oluşmaz.
 */
public class _02_StringBuilderSinifi {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();  //boş bir string builder nesnesi üretttik.
		sb1.append("Java15");
		System.out.println(sb1);
		System.out.println(sb1.replace(4,6,"2500")); //sb1 = Java StringBuilder Öğreniyor.500
		System.out.println(sb1.insert(5,"StringBuilder Ogreniyor")); //5.indexten sonra araya metin ekliyor.
		System.out.println(sb1);
		System.out.println(sb1.delete(5,10));
		
		
		
		
	}
	
}