package org.mehtor._02_Donguler._03_for;
/**
 for( başlangıç değeri ; koşul ; değişim(artış veya azalış) )
 */
public class _00_For_Ornek1 {
	public static void main(String[] args) {
		/*
		Sonsuz Döngü:
		for (;;){
			System.out.println("Selam");
		}*/
		int i, j;
		for (i = 0, j = i + 2; i < 5 && j > 1; i++, j = j + 2) {
			System.out.println("Merhaba " + i);
		}
		System.out.println(i);
		
		i = 0;
		j = i + 2;
		while (i < 5 && j > 1) {
			i++;
			j = j + 2;
		}
	}
}