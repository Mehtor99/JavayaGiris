package org.mehtor._06_Diziler;

import java.util.Arrays;

//Slayt 14.soru
public class _06_Soru14 {
	public static void main(String[] args) {
	String[] strings = new String[2];
		System.out.println(strings);//burada bize dönecek değer strings.toString() metodundan gelir. Onun içinde de
		// getClass().getName() + "@" + Integer.toHexString(hashCode()); satırı bize sınıf adını ve hashcode'u döner.
		// buna referansın gösterdiği adres gibi düşünebiliriz.
		// ben dizi içindeki elemanları görmeyi umuyorum:
		System.out.println(Arrays.toString(strings));
		
		for (String item:strings){
			System.out.println(item);
		}
		
		for (int i = 0; i < strings.length; i++) {
			System.out.println("# " + strings[i]);
		}
	}
}