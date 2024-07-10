package org.mehtor._07_Methods;

public class _05_finalParametreliMetod {
	int hiz = 0 ;
	
	public static void main(String[] args) {
		_05_finalParametreliMetod obj=new _05_finalParametreliMetod();
		System.out.println(obj.hiz);
		obj.hizArtir(50);
		System.out.println(obj.hiz);
	}
	/**
	 *
	 * @param yeniHiz final olarak tanımlandığı için metod gövdesinde bu parametrenin değeri değiştirilemez.
	 *                final ile değişkeni sabit yapmayı görmüştük. Burada da parametre değişkenini sabitliyor.
	 */
	public void hizArtir(final int yeniHiz){
		//yeniHiz=yeniHiz*2; //
		hiz=yeniHiz;
	}
	
	public String selam(String isim){
		return isim+" Selam!";
	}
	
}