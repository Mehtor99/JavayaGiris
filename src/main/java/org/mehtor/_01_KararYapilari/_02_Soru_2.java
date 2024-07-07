package org.mehtor._01_KararYapilari;

public class _02_Soru_2 {
	/*
	Soru: Bir matematik oyunu yazıyorsunuz ve kullanıcının verilen soruya doğru cevap verip vermediğini kontrol etmeniz gerekiyor.
    Eğer kullanıcı doğru cevap verirse "Tebrikler! Doğru cevap.", yanlış cevap verirse "Maalesef yanlış cevap, tekrar
  dene." mesajı gösterilmelidir.
	 */
	public static void main(String[] args) {
		int soru = 10;
		int cevap = 20;
		
		if(cevap ==soru){
			System.out.println("Tebrikler! Dogru cevap.");
		}else{
			System.out.println("Maalesef yanlis cevap.");
		}
	
	}
}