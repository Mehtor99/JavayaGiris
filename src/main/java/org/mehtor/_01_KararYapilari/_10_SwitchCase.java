package org.mehtor._01_KararYapilari;

public class _10_SwitchCase {
	public static void main(String[] args) {
	/*
		switch(ifade){
			case sabitdeger:
				//buraya çalışacak kodlar gelecek.
			case sabitdeger:
				//buraya çalışacak kodlar gelecek.
			case sabitdeger:
				//buraya çalışacak kodlar gelecek.
			default:
				//buraya diğer durumlara uymayan kodlar gelecek.
		}
		 */
		
		int sayi = 20;
		//Switch içine girilebilecek değer tipleri: byte,short,int,char, String
		
		switch (sayi){
			case 10:
				System.out.println("deger 10'dur");
				break;
			case 20:
				System.out.println("deger 20'dir");
				break;
			case 30:
				System.out.println("deger 30'dur");
			default:
				System.out.println("Sayi 10-20-30 değildir.");
		}
		
		
		int month = 5;
		String ay = "";
		
		ay = switch(month){
			case 1->"Ocak";
			
			case 2->"Subat";
			
			default -> "Deger yanlis";
		};
		System.out.println(ay);
		
	}
}