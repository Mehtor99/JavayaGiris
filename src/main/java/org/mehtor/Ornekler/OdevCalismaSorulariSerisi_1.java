package org.mehtor.Ornekler;

import java.util.Random;
import java.util.Scanner;

public class OdevCalismaSorulariSerisi_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir metin giriniz: ");
		String text = sc.nextLine();
		int count = 0;
		for(int i = 0;i<text.length();i++){
			char ch = text.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u'){
				count+=1;
			}
		}    //Turkce karakterlerde hata aldım.
		System.out.println(count);
	}
}