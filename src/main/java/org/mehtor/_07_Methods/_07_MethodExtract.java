package org.mehtor._07_Methods;

import static org.mehtor._07_Methods._02_TekParametreliMethod.baslikYazdir;

/*yazdığımız bir kodu sonradan method yapmak istediğimizde o kod bloğunu seçip
 extract sonrada method diyerek yeni bir method oluşturabilriz.

 */
public class _07_MethodExtract {
	public static void main(String[] args) {
		
		String deger = "BASLIK";
		baslikYazdir(deger);
		
		carp(3,4,5,6,7,8,1,10); // metodu yazıp Alt+Enter tuşlarına basarak IDE'nin olmayan metodu oluşturmasını sağlayabilirsiniz.
		
	}
	
	private static void carp(int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7) {
	}
	
	private static void baslikYazdir(String deger) {
		System.out.println("****************");
		System.out.println("*****" + deger + "******");
		System.out.println("****************");
	}
}