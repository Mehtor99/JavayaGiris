package org.mehtor._01_KararYapilari;

public class _04_StringEquals {
	public static void main(String[] args) {
		String str1=new String("Deneme"); // str1=0xAA20
		String str2=new String("Deneme"); // str2=0xAA21
		// == operatörü ile kontol referans adreslerin eşitliği üzerinedir.
		if(str1==str2){
			System.out.println("Bu iki değer birbirine eşit.");
		}
		else {
			System.out.println("Bu iki değer birbirine eşit değildir.");
		}
		
		if(str1.equals(str2)){
			System.out.println("Bu 2 stringin içeriği birbirine eşit.");
		}
		else{
			System.out.println("Bu 2 stringin içeriği birbirine eşit değildir.");
		}
		
		String str3="Deneme"; // 0xAA22
		String str4="Deneme"; // 0xAA22
		
		if(str3==str4){
			System.out.println("str3 ile str4 aynı adresi gösteriyor.");
		}
		
		String str5="Deneme"; // 0xAA22
		String str6=new String("Deneme"); // 0xAA23
		
		if(str5==str6){
			System.out.println("str5 ile str6 aynı adresi gösteriyor.");
		}
	}
}