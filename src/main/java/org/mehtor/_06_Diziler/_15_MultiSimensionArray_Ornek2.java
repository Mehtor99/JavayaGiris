package org.mehtor._06_Diziler;

public class _15_MultiSimensionArray_Ornek2 {
	public static void main(String[] args) {
		int[][] sayilar= {
				{1,2,3,4},  //ort: 2.5 ort ozerinde 2 sayi var.
				{5,6,7,100},//
				{0,10,11,12},//
		};
		
		//her bir satirin ortalamasini bulup, ortalama üzerindeki eleman sayisini bulun.
		
		//her bir satirin ortalamasini bulma:
		for (int i = 0; i < sayilar.length; i++) { //0,1,2
			double toplam =0;
			for (int j = 0; j < sayilar[0].length; j++) {  //0,1,2,3
				toplam+=sayilar[i][j];
			}
			double ort = toplam/sayilar[0].length;
			System.out.println(i+". satırın toplam: "+toplam+" ort: "+ort);
			
			int ortUzerindekiElemanSayisi =0;
			for (int j = 0; j < sayilar[0].length; j++) {
				if (sayilar[i][j]>ort){
					ortUzerindekiElemanSayisi++;
				}
			}
			System.out.println(i+". satirda ortalama uzerindeki eleman sayisi: "+ortUzerindekiElemanSayisi );
		}
		
	
	}
}