package org.mehtor._06_Diziler;
/**
 * 5 elemanlı bir int dizisi tanımlayın,
 * kullanıcıdan alınan değerleri bu diziye aktarın.
 * Ardından dizinin elemanlarının sırasını ters çevirip,
 * yazdırın.
 */
import java.util.Arrays;
import java.util.Scanner;

public class _07_Soru15 {
	public static void main(String[] args) {
		int sayilar[] = new int[5];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < sayilar.length; i++) {
			System.out.println((i+1)+".sayiyi giriniz: ");
			sayilar[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(sayilar));
		
		/*
		for (int i = sayilar.length-1; i >=0 ; i--) {
		     System.out.print(sayilar[i]);
		}
		 */
		
		int temp ;
		//sayilar[0]  sayilar[4]   yer degistirmeli
		//sayilar[1]   sayilar[3]  yer degistirmeli
		for (int i = 0; i < sayilar.length/2; i++) {
			temp = sayilar[i];
			sayilar[i] = sayilar[sayilar.length-1-i];
			sayilar[sayilar.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(sayilar));
		System.out.println(sayilar.length);
	}
}