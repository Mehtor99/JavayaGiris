package org.mehtor._03_StringSinifi;
//StringBuilder cok daha hızlıdır.çünkü yeni nesne oluşturmaz.
public class _04_StringVSStringBuilder {
	public static void main(String[] args) {
		int islemadet = 100_000;
		long startTime =System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		for(int i = 0; i<islemadet ; i++){
			sb.append(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);  //11ms
	}
}