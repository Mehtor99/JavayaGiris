package org.mehtor._01_KararYapilari;

import java.util.Scanner;

/*
Kullanıcının girdiği sayının
pozitif,
negatif veya
sıfır olduğunu belirleyen bir program yazmanız gerekiyor.
 Bu durumda if-else-if-else yapısı kullanarak bir program yazabilirsiniz.
 */
public class _7_Soru6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir sayi giriniz: ");
		int sayi = sc.nextInt();
		
		if (sayi<0){
			System.out.println("sayi Negatigtir");
		}
		else if (sayi>0) {
			System.out.println("sayi Pozitiftir");
		}else{
			System.out.println("sayi sifir");
		}
	}
}