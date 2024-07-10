package org.mehtor._07_Methods;

public class _06_Varargs {
	public static void main(String[] args) {
		int sum1 = sum(5,10);
		int sum2 = sum(4,10,15);
		
		System.out.println(sum(1,2,3,4,5,6,7,8,9));
		
		
		
		
	}
	
	
	//dışarıdan 2 int sayı parametre olarak alan ve toplamlarını int olarak dönen bir sum metodu yazın.
	public static int sum(int sayi1,int sayi2){
		return sayi1+sayi2;
	}
	
	//dışarıdan 3 int sayı parametre olarak alan ve toplamlarını int olarak dönen bir sum metodu yazın.
	public static int sum(int sayi1,int sayi2,int sayi3){
		return sayi1+sayi2+sayi3;
	}
	
	public static int sum(int...sayilar){
		int sum = 0;
		for (int item:sayilar){
			sum+=item;
		}
		return sum;
	}
}