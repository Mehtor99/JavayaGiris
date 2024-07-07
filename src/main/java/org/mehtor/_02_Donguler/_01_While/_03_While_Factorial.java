package org.mehtor._02_Donguler._01_While;

import java.util.Scanner;
/*
Kullanıcıdan alınan sayının faktöryelini bulan programı while kullanarak yazınız.
5! = 5*4*3*2*1 = 120
4! = 4*3*2*1 =24
3! = 3*2*1 =6
 */
public class _03_While_Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Faktoriyali, alinacak sayiyi giriniz: ");
		int sayi = sc.nextInt();
		int factorial=1;
		
		while(sayi>0){
			if(sayi == 1){
				System.out.print(sayi);
			}else {
				System.out.print(sayi+"*");
			}
			factorial *= sayi;
			sayi --;
		}
		System.out.println(" = "+factorial);
	}
}