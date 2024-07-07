package org.mehtor._02_Donguler._03_for;
//1-100 arası tek sayilar toplamini for ile bulan program.
public class _04_For_Ornek5 {
	public static void main(String[] args) {
		int total=0;
		
		for (int i =1;i<=100 ;i+=2 ){
			total += i;
		}
		System.out.println(total);
	}
}