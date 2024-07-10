package org.mehtor._07_Methods;
/**
 * Javada metodlar pass-by-value şeklinde çalışır.
 * primitive data type'lar parametre olarak kullanılırsa beklenildiği gibi gönderilen değişkenin değeri metod içindeki değişimden etkilenmez.
 * complex(reference) data type'lar parametre olarak kullanılırsa gönderilen nesnenin adresi metoda aktarılır. O yüzden metod içinde yapılan değişim direkt olarak o nesne üzerinde de gerçekleştirilir.
 *
 * pass-by-referance X pass-by-value
 */
public class _04_PassByValue {
	public static void main(String[] args) {
		int sayi=10;
		artir(sayi);
		System.out.println("Sayi="+sayi);
		
		Adet adetRef = new Adet();//yeni bir adet nesnesi oluşturduk.
		artirAdet(adetRef);
		System.out.println("AdetRef i değeri="+adetRef.i);
		
	}
	public static void artir(int i) {
		i++;
		System.out.println("i=" + i);
	}
	
	public static void artirAdet(Adet adet) {
		adet.i++;
		System.out.println("adet.i=" + adet.i);
	}
	
}

class Adet{
	int i =5;
}