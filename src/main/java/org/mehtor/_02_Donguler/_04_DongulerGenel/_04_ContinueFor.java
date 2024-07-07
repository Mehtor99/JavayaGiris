package org.mehtor._02_Donguler._04_DongulerGenel;

public class _04_ContinueFor {
	public static void main(String[] args) {
		for(int i = 0;i<5;i++){
			if(i==3){
				continue;  //bir sonraki iterasyon ile devam et.
			}
			System.out.println(i);
		}
		System.out.println("Dongu sonlandi");
	}
}