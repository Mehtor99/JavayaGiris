package org.mehtor._02_Donguler._01_While;

import java.util.Scanner;

/*
Kullanıcıdan alınan kelimenin tersten yazilisi aynı "Polidrom", değilse " Polidrom Değil yazdıralım.
 */
public class _05_While_Ornek5 {
	public static void main(String[] args) {
		//charAt,length ve while ile kelimenin tersini bul, equals ile eşitliğini kontrol et.
		Scanner sc = new Scanner(System.in);
		System.out.println("bir kelime giriniz: ");
		String kelime = sc.next();
		String tersi= "";
		int harfSayisi = kelime.length();
		int index = harfSayisi-1;
		
		while(index>=0){
			tersi = tersi+kelime.charAt(index);
			index--;
		}
		System.out.println(tersi);
		
		if(kelime.equalsIgnoreCase(tersi)){
			System.out.println("polidrom");
		}else{
			System.out.println("polidrom degil");
		}
		
		
		
		
	}
}