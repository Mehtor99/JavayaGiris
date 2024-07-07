package org.mehtor._02_Donguler._03_for;

import java.util.Scanner;

public class _09_For_Ucgen2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ucgen boyutu giriniz: ");
		int boyut = sc.nextInt();
		
		String yildiz = "*";
		
		for (int i = boyut; i>0;i--){
			for (int j = i;j>0;j--){
				System.out.print(yildiz);
			}
			System.out.println();
		}
		
		
		
		
		
	}
}