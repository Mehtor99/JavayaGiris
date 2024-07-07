package org.mehtor._01_KararYapilari;

import java.util.Scanner;

public class _05_Soru4 {
	/*
Kullanıcının girdiği not bilgisine göre(Scanner) harf notu hesaplayan bir program yazmanız gerekiyor.
 90 ve üzeri AA,
 80-89 arası BA,
 70-79 arası BB,
 60-69 arası CB,
 50-59 arası CC,
 40-49 arası DC,
 30-39 arası DD,
 0-29 arası FF olarak belirlenmiştir.
 
 Bu durumda if-else-if-else yapısı kullanarak bir program yazabilirsiniz.

 */
	public static void main(String[] args) {
		int not;
		Scanner sc = new Scanner(System.in);
		System.out.print("Notunuzu giriniz: ");
		not = sc.nextInt();
		
		if (not>=90){
			System.out.println("AA");
		}
		else if (not>=80) {
			System.out.println("BA");
		}else if (not>=70) {
			System.out.println("BB");
		}else if (not>=60) {
			System.out.println("CB");
		}else if (not>=50) {
			System.out.println("CC");
		}else if (not>=40) {
			System.out.println("DC");
		}else if (not>=30) {
			System.out.println("DD");
		}else if (not>=0) {
			System.out.println("FF");
		}else{
			System.out.println("Gireceğiniz not 0-100 arasında olmalıdır.");
		}
		
		System.out.println("Program sonlandi");
	}
}