package org.mehtor._02_Donguler._01_While;
/*
1-100 arası sayilari while ile toplama.
 */
public class _06_Ornek6 {
	public static void main(String[] args) {
		
		int total=0;
	    int i=0;
		while(i<=100){
			total+=i;
			i++;
		}
		System.out.println(total);
	}
}