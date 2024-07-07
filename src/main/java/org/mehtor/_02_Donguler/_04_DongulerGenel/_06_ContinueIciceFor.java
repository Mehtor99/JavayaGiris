package org.mehtor._02_Donguler._04_DongulerGenel;

public class _06_ContinueIciceFor {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if(i==3 && j==2){
					continue; //sadece iç döngüyü kırdı.
				}
				System.out.println("i: "+i+",j: "+j);
			}
			
		}
		System.out.println("Döngüler sonlandı.");
	}
}