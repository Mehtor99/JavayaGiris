package org.mehtor.Ornekler;

import java.util.Scanner;

public class SlaytOrnek {
    public static void main(String[] args) {
        int x =20;
        double y = 40.5;
        long p = 30;
        float q = 10.60f;
        //int z = x+y;  //Error; cannot convert from double to int  //hata; doubleden int e donusum yapilamiyor.
        double z = x + y;
        System.out.println("Toplam: " + z);
        //long r = p - q;  //Error; cannot convert from float to long  //hata: floattan long a donusum yapilamiyor.
        float r = p- q;
        System.out.println("Fark: "+ r);
////////////////////////////////////////////////////////////////
        int a;
        System.out.println("a sayisini giriniz: ");
        Scanner input= new Scanner(System.in);
        a = input.nextInt();
        System.out.println("girdiğiniz sayi"+a);
    }
}