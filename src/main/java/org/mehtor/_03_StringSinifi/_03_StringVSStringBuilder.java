package org.mehtor._03_StringSinifi;

public class _03_StringVSStringBuilder {
	public static void main(String[] args) {
		int islemadet = 100_000;
		long startTime =System.currentTimeMillis();
		
		String metin = "Hello";
		for(int i = 0; i<islemadet ; i++){
			metin+=i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);  //3349ms
	}
}