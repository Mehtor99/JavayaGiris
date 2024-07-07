package org.mehtor._02_Donguler._04_DongulerGenel;

public class _05_ContinueWhile {
	public static void main(String[] args) {
		int i=0;
		while(i<10){
			i++;
			if(i==3)
			{
				continue; // continue komutu ile iterasyon döngünün en başından devam eder. alt satırlar işlenmez.
			}
			System.out.println(i);
			
		}
		System.out.println("Döngü sonlandı.");
	}
}