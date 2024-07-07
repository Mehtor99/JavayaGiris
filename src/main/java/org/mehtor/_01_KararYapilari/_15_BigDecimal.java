package org.mehtor._01_KararYapilari;

import java.math.BigDecimal;

public class _15_BigDecimal {
	public static void main(String[] args) {
		float sonucFloat = 0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f;
		System.out.println(sonucFloat);
		
		double sonucDouble =0.1+0.1+0.1+0.1+0.1+0.1+0.1;
		System.out.println(sonucDouble);
		
		double sonucDouble2 =0.1*0.1;
		System.out.println(sonucDouble2);
		
		BigDecimal sayi = new BigDecimal("0.1");   //sayiyi tırnak içinde yazmazsan yanlış sonuç verir.
		BigDecimal sonucBigDecimal = sayi.add(sayi).add(sayi).add(sayi).add(sayi).add(sayi).add(sayi);
		System.out.println(sonucBigDecimal);
		
		BigDecimal sayi1 = new BigDecimal("0.1");
		BigDecimal sonucBigDecimal2 = sayi1.multiply(sayi1);
		System.out.println(sonucBigDecimal2);
		
		//dongu ile yapalım
		for (int i =0; i<7;i++){
			sonucBigDecimal = sonucBigDecimal.add(sayi);
		}
		System.out.println(sonucBigDecimal);
	}
}