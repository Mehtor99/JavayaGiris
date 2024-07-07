package org.mehtor._01_KararYapilari;

import java.util.Scanner;

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
 
 Bu durumda switch-case yapısı kullanarak bir program yazınız.
 */
public class _13_SwitchCaseSoru1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Notunuzu giriniz: ");
		int not = sc.nextInt();
		not = not / 10;
		String harfNotu;
		
		harfNotu = switch (not) {
			case 9 -> "AA";
			case 8 -> "BA";
			case 7 -> "BB";
			case 6 -> "BC";
			case 5 -> "CC";
			case 4 -> "DC";
			case 3 -> "DD";
			default -> "FF";
		} ;
		System.out.println(harfNotu);
		
	}
}