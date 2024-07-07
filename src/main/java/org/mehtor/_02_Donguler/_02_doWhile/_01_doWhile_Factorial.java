package org.mehtor._02_Donguler._02_doWhile;

import java.util.Scanner;

public class _01_doWhile_Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Faktoryeli alınacak sayıyı giriniz: ");
		int sayi = sc.nextInt();
		 long factorial = 1;
		 
		 do {
			 if (sayi == 1){
				 System.out.print(sayi);
			 }else{
				 System.out.print(sayi+"*");
			 }
			 factorial*=sayi;
			 sayi--;
		 }while(sayi>0);
		
		System.out.println("= "+factorial);
		
	}
}