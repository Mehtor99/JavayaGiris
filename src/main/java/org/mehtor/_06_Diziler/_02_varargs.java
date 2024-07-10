package org.mehtor._06_Diziler;

public class _02_varargs {
	public static void main(String[] args) {
		//variable arguments vir metoda ayni tipte ,değişken sayida değer göndermek için kullanilir.
		//metod parametresinde dizi kullanımının alternatifidir.
		//main metodu pqarametre olarak String[] arg almaktadır.yani bir string dizisini parametre olarak alabiliyor.
		//burada String[] args yerine String... args da kullanılabiliyor.
		
		int toplam = topla(2,3,4,5);
		System.out.println(toplam);
	}
	
	//ornek bir metod yazalım:
	public static int topla(int...sayilar){
		int toplam =0;
		for (int item:sayilar){
			toplam+=item;
		}
		return toplam;
	}
}