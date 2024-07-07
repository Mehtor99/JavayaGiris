package org.mehtor._01_KararYapilari;

public class _01_Soru1 {
	public static void main(String[] args) {
/*  /*
        Bir program yazmanız gerekiyor ve kullanıcıların yaşlarına göre mesaj alacaklar.
        18 yaş altı kullanıcılara "Bu içeriğe erişim izniniz yok."
        18-30 yaş aralığındaki kullanıcılara "İçeriği görüntülemek için yaşınız yeterli."
        30 yaş üstü kullanıcılara "Bu içerik sizin yaş grubunuza yönelik değildir." mesajı gösterilmelidir.
        (yas değişken değerini 25 vererek deneyebilirsiniz.)
         */
		
		int yas = 18;
		if (yas < 18) {
			System.out.println("Bu içeriğe erişim izniniz yok.");
		}
		else if (yas >= 18 && yas < 30) {
			System.out.println("İçeriği görüntülemek için yaşınız yeterli.");
		}
		else {
			System.out.println("Bu içerik sizin yaş grubunuza yönelik değildir.");
		}
	}
}