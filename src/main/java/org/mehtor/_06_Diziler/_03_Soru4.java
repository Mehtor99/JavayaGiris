package org.mehtor._06_Diziler;

import java.util.Arrays;

//Slayttaki 4.soru
public class _03_Soru4 {
	public static void main(String[] args) {
		isimYaz("Elif");
		isimYaz(new String[]{"Mehmet"});
		
		String[] isimler =new String[]{"Su"};
		
		isimleriYaz(isimler); // bir metod parametre olarak String dizisi bekliyorsa, ona argüman olarak String dizisi gönderilebilir.
		isimleriYaz(new String[]{"su"});
	}
	public static void isimYaz(String...isimler){
		System.out.println(Arrays.toString(isimler));
	}
	
	public static void isimleriYaz(String[] isimler) {
		System.out.println(Arrays.toString(isimler));
	}
}