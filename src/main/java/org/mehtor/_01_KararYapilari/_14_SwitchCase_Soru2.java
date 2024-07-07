package org.mehtor._01_KararYapilari;

public class _14_SwitchCase_Soru2 {
	public static void main(String[] args) {
		char karakter = 'a';
		switch (karakter){
			case 97:
				System.out.println("a harfi girildi...");
				break;
			case 'b':
				System.out.println("b harfi girildi");
				break;
			default:
				System.out.println("hangi harf bilemedim.");
		};
		
		
		String deger = "isparta";
		switch (deger.toLowerCase()){
			case "ankara":
				System.out.println("06");
				break;
			case "izmir":
				System.out.println("35");
				break;
			case "isparta":
				System.out.println("32");
			default:
				System.out.println("plakasini bilemedim");
			 
		}
		
	}
}