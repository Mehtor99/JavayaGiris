package org.mehtor._02_Donguler._03_for;
//1-n arasi sayilarin toplamını for ile yazdıran program.
import java.util.Scanner;

public class _02_For_Ornek3 {
	public static void main(String[] args) {
		//kullanıcıdan sayi alma
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir sayi giriniz: ");
		int n = sc.nextInt();
		//toplam değişkeni tanımlama
		int total =0;
		//for döngüsü ile sayilari toplama
		for (int i = 1; i <= n;i++){
			total += i;
		}
		//toplamı ekrana yazdırma
		System.out.println("1-n arasi sayilarin toplami: "+total);
	}
}