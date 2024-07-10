package org.mehtor._07_Methods;
//metod,function,procedure,subprogram,subroutine  gibi isimleri vardir
//
public class _00_Methods {
	
	//static sinifa bağlidir.
	public static void main(String[] args) {
		_00_Methods obj = new _00_Methods();
		obj.selam();
		
		System.out.println(topla(3,5));
		
		System.out.println(ekle("Mehmet","Ertop"));
		
		toplam(2,3);
		
		System.out.println(max(13,5));
		
		
		
	}
	
	public void selam(){
		System.out.println("selam");
	}
	public static int topla(int sayi1,int sayi2){
		int sonuc = sayi1 + sayi2;
		return sonuc;
	}
	public static int topla(double sayi1, int sayi2) {
		return 10;
	}
	
	public static int topla(int a,int b,int c){ //parametrelerin scope'u yazıldığı metoddur.
		return  50;
	}
	
	public static int topla(){
		return 50;
	}
	
	public static String ekle(String a,String b){
		return a+" "+b;
	}
	public static void dosyayaYaz(String metin){
		///metin dosyaya yazma komutları.
		/*if(metin başarılı bir şekilde yazıldıysa)
			return true;
		else
			return false;*/
	}
	
	public static void toplam(int a,int b) {
		System.out.println("toplam metodu çağrıldı...");
		System.out.println(topla(a, b));
	}
	
	public static int[] notlar(int[] not){
		int[] notDizisi = {5,10,15,20,25};
		return notDizisi;
	}
	
	public static int max(int a,int b){
		if (a>b){
			return a;
		}else {
			return b;
		}
	}
}