package org.mehtor._01_KararYapilari;

import java.util.Scanner;

public class _6_Soru5 {
	/*
Kullanıcının girdiği ürün fiyatına göre(scanner) indirim uygulayan bir program yazmanız gerekiyor.
 Ürün fiyatı 1000 TL veya üzerinde ise %20,
  500-999 TL arası %10,
  100-499 TL arası %5 indirim uygulanacaktır.
  Bu durumda if-else-if-else yapısı kullanarak bir program yazabilirsiniz.

 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("urun fiyati giriniz: ");
		float fiyat = sc.nextFloat();
		
		if (fiyat >= 1000) {
			System.out.println("Indirimli fiyat: " + fiyat * 0.8);
		}
		else if (fiyat >= 500) {
			System.out.println("Indieimli fiyat: " + fiyat * 0.9);
		}
		else if (fiyat >= 100) {
			System.out.println("Indirimli fiyat: " + fiyat * 0.95);
		}
	}
}