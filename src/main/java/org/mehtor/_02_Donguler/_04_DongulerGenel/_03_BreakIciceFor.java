package org.mehtor._02_Donguler._04_DongulerGenel;

public class _03_BreakIciceFor {
	public static void main(String[] args) {
		//ilk durum:
		System.out.println("İlk Durum:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if(i==3 && j==2){
					break; //sadece iç döngüyü kırdı.
				}
				System.out.println("i: "+i+",j: "+j);
			}
			
		}
		System.out.println("Döngüler sonlandı.");
		
		//Etiketli durum:
		System.out.println("Etiketli Durum:");
		etiket:
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if(i==3 && j==2){
					break etiket; //dış döngüyü de kırdı.
				}
				System.out.println("i: "+i+",j: "+j);
			}
			
		}
		System.out.println("Döngüler sonlandı.");
	}
}