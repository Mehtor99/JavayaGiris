package org.mehtor._07_Methods;

public class Calisan {
	public String ad;
	public String soyad;
	private Integer yas; //sadece bu classtan erişim için
	
	public Integer getYas() {
		return yas;
	}
	
	public void setYas(Integer yas) {
		if(yas<100 && yas>10) {
			this.yas = yas;
		}
		else{
			System.out.println("yas değeri 10-100 arası olabilir...");
		}
	}
}

class Deneme{
	public static void main(String[] args) {
		//Sınıftan bir nesne oluşturma:
		Calisan calisan1 = new Calisan();
		//nesne üzerinden sınıf değişkenlere erişim:
		//calisan1.yas=150;
		calisan1.setYas(150);
		calisan1.ad="Ali";
		calisan1.soyad="Caliskan";
		
		System.out.println(calisan1.ad);
		System.out.println(calisan1.soyad);
		System.out.println(calisan1.getYas());
	}
	}