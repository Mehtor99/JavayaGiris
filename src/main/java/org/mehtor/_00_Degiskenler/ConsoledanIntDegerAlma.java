package org.mehtor._00_Degiskenler;

import java.util.Scanner;

public class ConsoledanIntDegerAlma {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sayi1,sayi2,sonuc;
        System.out.println("1.sayiyi giriniz");
        sayi1=sc.nextInt();

        System.out.println("2.sayiyi giriniz");
        sayi2=sc.nextInt();

        sonuc=sayi1+sayi2;
        System.out.println("sonuc: "+sonuc);
    }
}