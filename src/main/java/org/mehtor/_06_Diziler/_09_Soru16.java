package org.mehtor._06_Diziler;

import java.util.Scanner;

/*Önce Dizi eleman sayısını ve dizideki elemanları kullanıcıdan alınız

Dizideki en büyük elemanı  bulan  ve bulunduğu indexi yazan programı yazınız.
*/
public class _09_Soru16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("dizi kac elemanli olsun");
		int dizi[] =new int[input.nextInt()];
		
		System.out.println("dizi elemanlarini giriniz:");
		for (int i = 0; i < dizi.length; i++) {
				dizi[i] = input.nextInt();
		}
		
		// En büyük elemanı bulalım: 12 , 5 , 3
		// En küçük eleman ve indexini de siz yazdırın:
		int max=dizi[0]; //max:2
		int min=dizi[0]; //max:2
		
		int maxIndex=0;
		int minIndex=0;
		
		for (int i = 0; i < dizi.length; i++) {
			if(dizi[i]>max){
				max=dizi[i]; //max:5
				maxIndex=i;
			}
			if(dizi[i]<min){
				min=dizi[i];
				minIndex=i;
			}
		}
		System.out.println("Max:"+max+" MaxIndex: "+maxIndex);
		System.out.println("Min:"+min+" MinIndex: "+minIndex);
		
	}
}