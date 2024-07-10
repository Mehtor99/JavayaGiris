package org.mehtor._06_Diziler;
/*
       Sno     No         Ad       Not
       1       101        Ece      100
       2       102        Su       80
       3       103        Ali      70
       4       104        Can      40
    Bu yapı çok boyutlu dizide tutulabilir mi?
 */
public class _13_MDArray_Ornek1 {
	public static void main(String[] args) {
		String[][] sinifListesi =
				{
						{"1", "101", "Ece", "100"},
						{"2", "102", "Su", "80"},
						{"3", "103", "Ali", "70"},
						{"4", "104", "Can",	"40"}
				};
		
		String[][] sinifListesi2=new String[4][4];
		sinifListesi2[0][0]="1";
		sinifListesi2[0][1]="101";
		sinifListesi2[0][2]="Ece";
		sinifListesi2[0][3]="100";
		
		sinifListesi2[1][0]="2";
		sinifListesi2[1][1]="102";
		sinifListesi2[1][2]="Su";
		sinifListesi2[1][3]="80";
	
		
		//sinifListesi dizisindeki tüm elemanları ekrana yazdırma:
		for (int i = 0; i < sinifListesi.length ; i++) {
			for (int j = 0; j <sinifListesi[0].length ; j++) {
				System.out.print(sinifListesi[i][j]+"\t\t");
			}
			System.out.println();
		}
		//sinifListesinin 0.satırındaki elemanlari yazdiralim:
		System.out.println("0.satir: ");
		for (int i = 0; i < sinifListesi[0].length; i++) {
			System.out.println(sinifListesi[0][i]+"\t\t");
		}
		//sinifL,stesinin 2.sütunundaki elemanlari yazdiralim:
		System.out.println("\n2.sutun");
		for (int i = 0; i< sinifListesi.length;i++){
			System.out.println(sinifListesi[i][2]);
		}
		
		//parse metodlari ile string degerler istenilen numeric type'a çevirilebilir.
		String sayi1 ="10";
		String sayi2 = "20";
		int toplam = Integer.parseInt(sayi1)+Integer.parseInt(sayi2);
		System.out.println(toplam);
		//sinif listesindeki ogrencilerin notlarinin toplamini ve ortalamasini bulun:
		int toplam1 = 0;
		System.out.println("\n4.sutun toplamlari");
		for (int i = 0; i < sinifListesi.length; i++) {
			toplam1 += Integer.parseInt(sinifListesi[i][3]);
		}
		System.out.println("toplam not: "+toplam1+ "  Ortalama: "+(toplam1/sinifListesi.length));
	}
}