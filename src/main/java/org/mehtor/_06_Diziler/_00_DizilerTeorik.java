package org.mehtor._06_Diziler;

public class _00_DizilerTeorik {
	public static void main(String[] args) {
		String ogr1="Ahmet Eriş";
		String ogr2="Alex Walker";
		String ogr3="Alper Güler";
		// her bir değer için ayrı değişken oluşturursak bu işin içinden çıkamayız.
		// bunun yerine diziler kullanılır.
		// dizilerde elemanlar aynı tip olmak zorundadır. (String, int...)
		// dizinin eleman sayısı başlangıçta belirtilmelidir.
		
		//dizi tanımlama:
		// kullanım 1:
		// 0.index,   1.index,      2.index
		String ogrenciler[]=new String[]{"Ahmet Eriş","Alex Walker","Alper Güler"}; // new String[3];
		// kullanım 2:
		String ogrenciler2[]={"Ahmet Eriş","Alex Walker","Alper Güler"}; // new String[3];
		
		// aşağıdaki kullanım Array Initilizer ile kullanımdır. Doğru bir kullanımdır. Buradaki adımlar ayrı
		// satırlarda yapılamaz.
		String[] iller={"Ankara","İstanbul"};
		/**
		 * yanlış kullanım:
		 * String[] iller;
		 * iller={"Ankara","İstanbul"};
		 */
		
		//1.adım :dizideki elemanların tipini yaz
		//2.adım: [] ekle.
		//3.adım: diziye bir ad ver. (Değişken isimlendirme kurallarına uyarak.)
		int intDizi[];
		int [] intDizi1;
		int[] intDizi2;
		int []intDizi3;
		int intDizi4 [];
		// dizinin eleman sayısını belirtme. [5] değeri ile 5 elemanlı bir dizi oluşturuluyor.
		intDizi=new int[5];
		intDizi[0]=50;
		intDizi[1]=20;
		intDizi[2]=30;
		intDizi[3]=80;
		intDizi[4]=90;
		//intDizi[5]=60; //ArrayIndexOutOfBoundsException hatası alırız. index numarası en fazla length-1 olabilir.
		// Dizinin eleman sayısı byte,short,int bir değişkenden de alınabilir.
		int diziElemanSayisi=10;
		boolean[] booleanDizi=new boolean[diziElemanSayisi];
		
		//Dizideki elemanlara erişim:
		System.out.println("ogrenciler[0] : "+ogrenciler[0]);
		System.out.println("ogrenciler[1] : "+ogrenciler[1]);
		System.out.println("ogrenciler[2] : "+ogrenciler[2]);
		
		System.out.println("intDizi[0] : "+intDizi[0]);
		// boolean tipli dizilerde değer atanmasa bile tüm gözlerdeki değerler false olur.
		System.out.println("booleanDizi[0] : "+booleanDizi[0]);
		System.out.println("booleanDizi[9] : "+booleanDizi[9]);
		// int tipli dizilerde değer atanmasa bile tüm gözlerdeki değerler 0 olur.
		int[] sayilar=new int[5];
		System.out.println("sayilar[0] :"+sayilar[0]  );
		// String tipli dizilerde değer atanmasa bile tüm gözlerdeki değerler null olur.
		String[] isimler=new String[10];
		System.out.println("isimler[0] : "+isimler[0]);
		isimler[0]=new String("Anıl");
		isimler[0]="Evrim"; //herhangi bir indexteki değeri değiştirebiliriz.
		isimler[1]="Emine";
		isimler[8]="Emirhan";
		//burada yapılan işlem dizinin eleman sayısını artırmaz. Yeni bir dizi tanımlanmış olur:
		isimler=new String[11];
		isimler[10]="Harun";
		//isimler[3]=50; int değeri String dizide tutamazsın. String dizide string dışında değer tutamazsın.
		
		//dizi içindeki tüm elemanları yazdırma:
		System.out.println("---------isimler dizisi:----------");
		for (int i = 0; i < isimler.length; i++) {
			System.out.println("isimler["+i+"] : "+isimler[i]);
		}
		//dizi içindeki tüm elemanları read only yapısı olan for each ile de yazdırabiliriz.
		System.out.println("---------isimler dizisi: foreach ile----------");
		//foreach kullanımı:
		/*
		for(dizitipinde bir değişken tanımla:dizinin adı){
		
		 */
		for (String item :isimler){
			System.out.println(item);
		}
		
		int[] notlar=null;
		notlar=new int[5];
		// .length dizilerde eleman sayısını getirir. .length() : String metodu olarak kullanmıştık.
		
		String[] aylar;
		String []aylaryillar[];
		
		
		
		
	}
}