package org.mehtor._00_Degiskenler;

public class DonusumlerOrnek {
	public static void main(String[] args) {
		byte b;
		int i=257;
		double d = 320.12;
		
		System.out.println("int >> byte  donusumu: ");
		b = (byte)i;
		System.out.println("i="+i+" b = "+b);
		
		System.out.println("double >> int donusumu: ");
		i = (int)d;
		System.out.println("d="+d+" i = "+i);
		
		System.out.println("double >> byte donusumu: ");
		b = (byte)d;
		System.out.println("d="+d+" b = "+b);
	}
}