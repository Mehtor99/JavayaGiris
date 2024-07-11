package org.mehtor._07_Methods;

public class _08_TeorikSoru8 {
	public static void su(){}
	public void getir(){
		su();  //bir sinif içerisinde bir metoddan başka bir metod çağırılabilir.
		//this._08_TeorikSoru8.su(); //this ile biz zaten bu sinifi çagırdigimiz i.in tekrar sınıf adı yazılmaz.
		this.su(); //
	  }
}