package org.mehtor._07_Methods;

public class _02_TekParametreliMethod {
	public static void main(String[] args) {
		
		System.out.println(onKati(2));
		System.out.println(karesi(5));
		baslikYazdir("tek parametreli");
		
		
	}
	
	
	public static int onKati(int sayi){
		return  sayi*10;
	}
	public static int karesi(int sayi){
		return sayi*sayi;
	}
	public static void baslikYazdir(String baslik){
		System.out.println("-------------------------------------");
		System.out.println("---------"+baslik+"---------");
		System.out.println("-------------------------------------");
	}
	
}