package org.mehtor._02_Donguler._03_for;
//1-50 arası sayilardan 3ün katı olanları ekrana yazdir.
public class _05_For_Ornek6 {
	public static void main(String[] args) {
		for (int i = 1; i<=50; i++){
			if(i%3==0){
				System.out.println(i);
			}
		}
	}
}