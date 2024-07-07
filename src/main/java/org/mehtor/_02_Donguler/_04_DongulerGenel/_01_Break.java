package org.mehtor._02_Donguler._04_DongulerGenel;
//switch-case,for,while, do while, gibi yapilarda donguuyu veya bloğu sonlandırmak icin kullanilir.
public class _01_Break {
	public static void main(String[] args) {
		
		
		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("for döngüsü sonlandı.");
	}
}