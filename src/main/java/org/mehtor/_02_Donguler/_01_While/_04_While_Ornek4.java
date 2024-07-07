package org.mehtor._02_Donguler._01_While;

import java.util.Scanner;

/*
kullanıcının girdiği kelimenin harf sayisini while ile bulan program.
 */
public class _04_While_Ornek4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("bir kelime giriniz: ");
		String kelime = sc.nextLine();
		
		System.out.println("length ile sonuc = "+kelime.length());
		int index = 0;
		while (true){
			try{
				kelime.charAt(index);
				index++;
			}
			catch (Exception e){
				//catch bloğu try bloğunda bir hata meydana geldiğinde çalışır.
				break;
			}
		}
		System.out.println(kelime+" harf sayisi="+index);
		}
	}