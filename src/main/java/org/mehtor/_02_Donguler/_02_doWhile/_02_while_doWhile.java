package org.mehtor._02_Donguler._02_doWhile;

public class _02_while_doWhile {
	public static void main(String[] args) {
		int i = 5;
		System.out.println("While Döngüsü:");
		
		while(i<5){
			System.out.println("i:"+ i++);
		}
		System.out.println("Do while döngüsü");
		i=5;
		do{
			System.out.println("i:"+ i++);
		}while(i<5);
	}
}