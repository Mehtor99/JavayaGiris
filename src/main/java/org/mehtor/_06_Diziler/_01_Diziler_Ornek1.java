package org.mehtor._06_Diziler;

import java.util.Random;

//for -random -dizi
//rastgele değerlerden(0-100) oluşan 10 elemanlı bir dizi oluşturup,ekrana yazdiralim.
public class _01_Diziler_Ornek1 {
	public static void main(String[] args) {
		// 10 elemanlı dizi tanımlama
		int[] rastgeleSayilar=new int[10]; //tanımlama esnasında [] içine eleman sayısı girilir.
		Random rand = new Random();
		// rastgele değerleri dizideki gözlere atama:
		for (int i = 0; i < rastgeleSayilar.length; i++) {
			rastgeleSayilar[i]=rand.nextInt(0,101);
		}
		// dizideki elemanları foreach ile yazdıralım:
		for(int item: rastgeleSayilar){
			System.out.println(item);
		}
		
		for (int i = 0; i <rastgeleSayilar.length; i++) {
			System.out.println(i+".indexteki eleman:"+rastgeleSayilar[i]); //rastgeleSayilar[10] bunu çağırırsan   ArrayIndexOutOfBoundsException hatası alırsın.
		}
	}
}