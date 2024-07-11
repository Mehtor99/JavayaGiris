package org.mehtor._07_Methods.sorular;
//Soru1: Bir tam sayı dizisini parametre olarak alan ve dizideki sayıların
//ortalamasını hesaplayarak geri döndüren bir ortalamaHesapla metodunu yazınız.

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class Metodlar {
	
	//Soru1.
	 double ortalamaHesapla(int[] sayilar){   //bunu erişim belirteci şuan defaulttur.yani sadece aynı package içerisinden erişilebilir.
		double toplam = 0;
		for (int sayi:sayilar){
			toplam+=sayi;
		}
		double ort = toplam/ sayilar.length;
		return ort;
	}
	
	//Soru2:Bir tamsayı parametre alan ve
    // sayının tek olup olmadığını kontrol eden
    // tekMi metodunu yazınız.
	boolean tekMi(int tamSayi){
		 return tamSayi%2==1;      //sayi tek ise true döner.
	}
	
	//Soru3: Bir tam sayı dizisi parametre alan ve
    // diziyi küçükten büyüğe doğru sıralayarak geri döndüren
    // bir metod yazınız.
	int[] siraliDizi(int[] sayilar){
		int[] yeniDizi = Arrays.copyOf(sayilar,sayilar.length);//dizinin kopyasını aldık. Kopyasini almazsak orjinal diziyi de değiştirir.
		Arrays.sort(yeniDizi); //diziyi siraladık.
		 return yeniDizi;//sıralanmış diziyi geri dondük.
	}
	
	//Soru4:İki tamsayı parametre alan ve
	// taban üzeri üs işlemini hesaplayarak sonucu geri döndüren bir metod yazınız.
	// 5,3 => 5*5*5 =125
	// 6,2 => 6*6=36
	// 2,5 => 2*2*2*2*2=32
	int usluDeger (int taban,int us){
		 int total=1;
		for (int i = 0; i <us ; i++) {
			total*=taban;
		}
		return total;
	}
	
	// Soru 5. Bir metin parametre alan ve
    // metindeki her kelimeyi tersine çevirerek geri döndüren bir metod yazınız.
	public String[] metindekiKelimeleriBul(String metin){
		return metin.split(" ");      // " " gördüğü yerlerden metni parçalara ayırıyor.
	 }
	 
	 public String kelimeTersiBul(String[] kelimeler){
		 StringBuilder sb =new StringBuilder();
		 for (String kelime:kelimeler){
			 StringBuilder tersKelime = new StringBuilder(kelime).reverse().append(" ");
			 sb.append(tersKelime);
		 }
		 return sb.toString().trim();
	 }
	
	// Soru 6. Bir tamsayı parametre alan ve
    // sayının asal olup olmadığını kontrol eden asalMi metodunu yazınız.
	boolean asalMi(int sayi){
		if(sayi<=1)
			return false;
		else if (sayi==2) {
			return true;
		}else {
			for (int i = 2; i <Math.sqrt(sayi) ; i++) {
				if (sayi%i==0){
					return false;    //returnden sonraki kodlar çalışmaz.
				}
			}
			return true;
		}
	}
	
	//Soru8. Bir tam sayı dizisi ve bir tamsayı parametre alan ve
	// dizideki en büyük n sayıyı içeren yeni bir dizi oluşturan ve geri döndüren bir metod.
	// {3,4,8,2,5} , 3 ,  sort ile önce sıralı hale getirmek iyi bir fikir olabilir: {2,3,4,5,8}
	// {8,5,4}
	 public int[] enBuyukNSayi(int[] sayilar,int n){
		 Arrays.sort(sayilar); //sayilar siralandi
		 int[] enBuyukSayilar = new int[n]; //n elemanli yeni dizimiz tanimlandi
		 for (int i = 0; i < enBuyukSayilar.length; i++) {
			 enBuyukSayilar[i] = sayilar[sayilar.length-1-i];
		 }
		 return enBuyukSayilar;
	 }
	
	//Soru12. Verilen metin içindeki uygun karakter sayılarını
	// kucukHarfSay(), (Bugün Hava Çok Güzel) =>13
	// buyukHarfSay(),
	// rakamSay(),
	// harfRakamHaricSay() metodlarını yazarak yazdırınız.
	int kucukHarfSay(String metin){
		 int count =0;
		for (int i = 0; i < metin.length(); i++) {
			//isLowerCase metodu ile içine girilen bir char'ın küçük harf
			// olup olmadığı kontrol edilebilir. Küçük harf ise true döner.
			if (Character.isLowerCase(metin.charAt(i))){
			count++;
			}
		}
		return count;
	}
	
	int buyukHarfSay(String metin){
		int count=0;
		for (int i = 0; i <metin.length() ; i++) {
			if(Character.isUpperCase(metin.charAt(i))){
				count++;
			}
		}
		return count;
	 }
	
}