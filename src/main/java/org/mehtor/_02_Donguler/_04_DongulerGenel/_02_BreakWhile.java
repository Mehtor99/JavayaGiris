package org.mehtor._02_Donguler._04_DongulerGenel;

public class _02_BreakWhile {
	public static void main(String[] args) {
		int i=0;
		while(i<10){
			
			if(i==3)
			{
				break;
			}
			System.out.println(i);
			i++;
		}
		System.out.println("Döngü sonlandı.");
	}
}