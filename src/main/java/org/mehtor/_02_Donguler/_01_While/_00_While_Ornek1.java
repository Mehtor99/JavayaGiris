package org.mehtor._02_Donguler._01_While;

public class _00_While_Ornek1 {
	public static void main(String[] args) {
		if(true){
			System.out.println("5 10dan kucuktur");
		}
		
		int i = 0;
		while(i<10){
			System.out.println("i: "+i);
			i++;
		}
		System.out.println("Program while'dan sonra devam ediyor...");
	}
}