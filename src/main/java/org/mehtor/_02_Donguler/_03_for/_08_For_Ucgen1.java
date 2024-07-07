package org.mehtor._02_Donguler._03_for;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.Scanner;

/*
Kullanıcıdan alınan sayı kadar satır ve sütuna sahip yıldız karakteri ile ucgen çizen programı for ile yazın.
/*
Beklenen çıktı:

Boyut girin: 3
*
**
***
 */
public class _08_For_Ucgen1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ucgen boyutu giriniz: ");
		int boyut = sc.nextInt();
		
		String yildiz = "";
		
		for (int i =0; i<boyut;i++){
			yildiz +="*";
			System.out.println(yildiz);
		}
	}
}