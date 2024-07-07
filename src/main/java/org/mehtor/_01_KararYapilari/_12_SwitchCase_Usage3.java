package org.mehtor._01_KararYapilari;

public class _12_SwitchCase_Usage3 {
	public static void main(String[] args) {
		int n = 2;
		double sayi1 = 10;
		double sayi2 = 20;
		double result;
		
		double sonuc = switch (n) {
			case 1 ->{
				result = sayi1+sayi2;
				yield result;
			}
			case 2 ->{
				result = sayi1-sayi2; //result -10 olarak hesaplandi.
				yield result;        //result değerini sonuca ver anlaminda.
			}
			default -> throw new IllegalStateException("Unexpection value: "+ n);
		};
		System.out.println(sonuc);
		
	}
}