package org.mehtor._07_Methods;

// method Overloading: Aynı isimde farklı parametre tiplerinde veya farklı parametre sayilarında metodlar yazmak.
public class _01_MethodOverloading {
	public static void main(String[] args) {
		int sum1 = sum(5,10);
		int sum2 = sum(3,4,5);
		double sum3 = sum(1.23,2.3,3.4);
		System.out.println("sum1: "+sum1);
		System.out.println("sum2: "+sum2);
		System.out.println("sum3: "+sum3);
		
		
	}
	
	//dısarıdan 2 int sayi parametre olarak alan ve toplamlarını int olarak donen bir sum metodu yazin
	public static int sum(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	//dısarıdan 2 int sayi parametre olarak alan ve toplamlarını int olarak donen bir sum metodu yazin
	public static int sum(int sayi1 ,int sayi2, int sayi3) {
		return sayi1 + sayi2 + sayi3;
	}
	//dısarıdan 3 double sayi parametre alarak toplaan metodu yazdık.
		public static double sum(double sayi1, double sayi2, double sayi3){
			return sayi1+sayi2+sayi3;
	}
	
}