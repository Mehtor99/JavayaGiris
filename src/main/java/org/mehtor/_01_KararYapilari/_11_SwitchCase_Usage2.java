package org.mehtor._01_KararYapilari;

public class _11_SwitchCase_Usage2 {
	public static void main(String[] args) {
		int month = 4;
		String deger = "birseyler";
		String ay = switch(month){
			case 1 -> "Ocak";
			case 2 -> "Subat";
			case 3 -> "Mart";
			case 4 -> "Nisan";
			case 5 -> "Mayis";
			case 6 -> "Haziran";
			default -> "yanlis ay girildi";
		};
		System.out.println(ay);
		
		
		int gun = 7;
		String gunTip=switch(gun){
		    case 1,2,3,4,5 ->"hafta ıcı";
		    case 6,7 -> "hafta sonu";
			default -> "1-7 arasi deger giriniz";
		};
		System.out.println(gunTip);
	}
}