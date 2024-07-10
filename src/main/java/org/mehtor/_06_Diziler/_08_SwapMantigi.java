package org.mehtor._06_Diziler;

public class _08_SwapMantigi {
	public static void main(String[] args) {
		int a=50;
		int b=20;
		System.out.println("a:"+a+" b:"+b);
		
		//temp: geçici değişken
		int temp=a; // a:50 , b:20 , temp: 50
		a=b;        // a:20, b:20, temp:50
		b=temp;     // a:20, b:50, temp:50
		System.out.println("a:"+a+" b:"+b);
		
		//temp kullanmadan değişim:
		a=50;
		b=20;
		System.out.println("a:"+a+" b:"+b);
		
		a=a+b; // a:70 , b:20
		b=a-b; // a:70, b:50
		a=a-b;
		System.out.println("a:"+a+" b:"+b);
		
	}
}