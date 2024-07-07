package org.mehtor._01_KararYapilari;

import java.util.Scanner;

public class _3_Soru3 {
	/*
	Bir seyahat uygulaması yazıyorsunuz ve kullanıcının gideceği şehre göre bilet fiyatını hesaplamanız gerekiyor.
	 Ankara'ya gidecek kullanıcılara 100 TL,
	  İstanbul'a gidecek kullanıcılara 200 TL,
	   izmir'e gidecek kullanıcılara 150 TL,
	    diğer şehirlere gidecek kullanıcılara ise "Geçerli bir şehir seçiniz." mesajı gösterilmelidir.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Gideceginiz sehri yaziniz: ");
		String sehir = sc.nextLine();
		int tutar = 0;
		
		if (sehir.equalsIgnoreCase("Ankara")){
			tutar = 100;
		}
		else if (sehir.equalsIgnoreCase("Istanbul")) {
			tutar = 200;
		}
		else if (sehir.equalsIgnoreCase("Izmır")) {
			tutar=150;
		} else {
			System.out.println("Gecerli bir sehir seciniz.");
		} System.out.println(tutar+ " Tl odeme yapiniz.");
	}
}