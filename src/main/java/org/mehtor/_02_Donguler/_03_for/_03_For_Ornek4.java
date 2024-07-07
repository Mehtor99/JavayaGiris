package org.mehtor._02_Donguler._03_for;
//1-10 arasi sayilarin fakroriyelini alt alta yazdiran program(for)
public class _03_For_Ornek4 {
	public static void main(String[] args) {
		int factorial = 1;
		
		for (int i = 1 ; i <=10;i++){
			factorial*=i;
			System.out.println(i+"!"+" = "+factorial);
		}
	}
}