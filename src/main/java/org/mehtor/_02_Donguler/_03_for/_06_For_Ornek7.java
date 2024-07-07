package org.mehtor._02_Donguler._03_for;
/*
1'den 100'e kadar olan sayıları ekrana yazdıran bir for döngüsü yazın.
Ancak 3'ün katlarında "3KAT",
 5'in katlarında "5KAT" ve hem 3 hem de 5'in katlarında "15KAT" yazdırın.
 */
public class _06_For_Ornek7 {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + "  15 kat");
			}
			else if (i % 3 == 0) {
				System.out.println(i + "  3 kat");
			}
			else if (i % 5 == 0) {
				System.out.println(i + "  5 kat");
			}
			else {
				System.out.println(i);
			}
			
			
		}
	}
	
	
}