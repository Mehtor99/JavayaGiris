package org.mehtor._06_Diziler;

public class _12_MultiDimensionalArray {
	public static void main(String[] args) {
		//Tanımlama:
		int[] sayilar ={5,6,7};  //tek boyutlu dizi
		int[][] koordinatlar = { //iki boyutlu dizi. satır: 3, sütun:2
				{1,2},
				{3,4},
				{5,6}
		};
		int[][] koordinatlar2= {  //iki boyutlu dizi. satir:2 ,sütun:3
				{1,2,3},
				{4,5,6}
		};
		//Diziye elemanlar atama:
		int[] sayilar2 = new int[10]; // 10 elemanli tek boyutlu dizi
		sayilar2[0] =5;
		
		int[][] koordinatlar3 = new int [3][2]; //3 satir 2 sütunlu iki boyurlı dizi
		koordinatlar3[0][0]=1;   //0,satır 0.sütun
		koordinatlar3[0][1]=2;   //0.satır 1.sütun
		
		koordinatlar3[1][0]=3;   // 1.satır 0.sütun
		koordinatlar3[1][1]=4;   // 1.satır 1.sütun
		
		koordinatlar3[2][0]=5;
		koordinatlar3[2][1]=6;
		
		//dizideki elemanlari yazdirma;
		System.out.println("koordinatlar3.length: "+koordinatlar3.length);//satir sayisini getirir.(3)
		System.out.println("koordinatlar3[0].length: "+koordinatlar3[0].length); //0.satırın sütun sayisini getirir.
		
		System.out.println(koordinatlar3[0][0]);
		System.out.println(koordinatlar3[0][1]);
		
		System.out.println(koordinatlar3[1][0]);
		System.out.println(koordinatlar3[1][1]);
		
		System.out.println(koordinatlar3[2][0]);
		System.out.println(koordinatlar3[2][1]);
		
		for (int i = 0; i < koordinatlar3.length; i++) {
			for (int j = 0; j <koordinatlar3[0].length ; j++) {
				System.out.println(koordinatlar3[i][j]);
			}
		}
		
	}
}