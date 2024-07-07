package org.mehtor._01_KararYapilari;

public class _00_KararYapilari {
	public static void main(String[] args) {
		/*
		if(mantıksal ifade)
			// koşul doğruysa çalışacak kod yazılır.
			
		 */
		if (10<50){
			System.out.println("kosul saglandigi icin bu kod ekrana yazdirildi.");
		}
		System.out.println("Sıradaki kodlar ne ise onlar çalışacak..");
		
		if (50 < 10) {
			System.out.println("2.koşul");
			System.out.println("2. koşul 2. satır");
		}
		
		/**
		 if(mantıksal ifade){
		 koşul doğru ise çalışacak kodlar
		 }
		 else{
		 koşul doğru değil ise çalışacak kodlar
		 }
		 */
		
		int sicaklik = 10;
		if (sicaklik > 20) {
			System.out.println("Klimayı çalıştır.");
		}
		else {
			System.out.println("Klimayı durdur");
		}
		
		sicaklik = 20;
		if (sicaklik < 0) {
			System.out.println("Klimayı çok aç");
		}
		else if (sicaklik < 10) {
			System.out.println("Klimayı az aç");
		}
		else if (sicaklik < 20) {
			System.out.println("Klimayı azıcık aç");
		}
		else {
			System.out.println("Klimayı kapat");
		}
		
		System.out.println("if else if blogundan sonraki kodlar...");
		
		
		
		
	}
}