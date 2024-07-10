package org.mehtor._06_Diziler;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class _14_ArraysSinifi {
	public static void main(String[] args) {
		int[] sayilar = {6,8,2,5,3};
		String[] isimler = {"Ahmet","Su","Can","Pelin","Atakan"};
		//1.Arrays.toString : bu metod içinde verilen dizideki elemanlari [] içinde aralarina , ekleyerek yazdırır.
		System.out.println("Orjinal Dizi: "+ Arrays.toString(sayilar));
		System.out.println("Orjinal Dizi: "+ Arrays.toString(isimler));
		
		//2. Arrays.sort: Diziye doğal siralama uygular.(doğal siralama : küçüktem büyüğe, A->Z ye doğru)
		Arrays.sort(sayilar);
		Arrays.sort(isimler);
		System.out.println("Arrays.sort işleminden sonra dizi: "+Arrays.toString(sayilar));
		System.out.println("Arrays.sort işleminden sonra dizi: "+Arrays.toString(isimler));
		System.out.println(sayilar[0]);
		//3. Arrays.binarySearch: Aranan eleman listede varsa index numarasini döner. yoksa negatif bir sayi döner.
		int index = Arrays.binarySearch(sayilar,10);
		System.out.println((index>0)?"Aranan eleman dizide bulundu":"Eleman dizide yok.");
		
		//4.Arrays.equals: Karşılaştırılan diziler içindeki elemanlar ve elemanların sırası aynı ise true döner, aksi halde false döner.
		int[] array1 = {0,1,2};
		int[] array2 = {0,1,2};
		boolean equals = Arrays.equals(array1,array2);
		if (array1==array2){// bu şekilde dizilerin eşitliği kontrol edilemez. Arrays.equals ile kontrol edebilirsiniz.
			System.out.println("arrayler ayni");
		}
		System.out.println(equals);
		
		//5.Arrays.fill ham hali dizinin bütün elemanlarını 1 yapar.Ancak içine değerler girerek belli indekslerin
		// arasina istenilen değerlerin yazilmasina olanak tanir.
		int[] array3=new int[10];
		System.out.println("Array3 ilk hali: "+Arrays.toString(array3));
		Arrays.fill(array3,1);
		System.out.println("Array 3 fill isleminden sonraki hali: "+Arrays.toString(array3));
		Arrays.fill(array3,4,7,2);
		System.out.println("Array3 fill işleminden sonraki hali: "+Arrays.toString(array3));
		//fill metodunda string de kullanılabilir.
		String[] degerler=new String[5];
		Arrays.fill(degerler,"Ahmet");
		System.out.println(Arrays.toString(degerler));
		
		//6.Arrays.copyOf: yeni bir diziye, var olan dizinin kopyasını aktarmak için kullanılabilir. Ayrıca yeni dizinin eleman sayısı belirlenebilir.
		int [] array4 ={5,2,8,4,6};
		int[] array5 = Arrays.copyOf(array4,10);
		System.out.println(Arrays.toString(array5));
		
		//7.Arrays.copyOfRange: Bütün dizinin bir kopyasını değil de o diziden belirli bir aralığın kopyasını almak için kullanulabilir.
		int[] array6 = Arrays.copyOfRange(array4,0,3);
		System.out.println(Arrays.toString(array6));
		
		//8.Arrays.stream: Array değerleri arasında toplama işlemleri yapar
		//sum: Toplama
		int sum = Arrays.stream(array4).sum();
		System.out.println("Sum: "+sum);
		//average: ortalama
		OptionalDouble average = Arrays.stream(array4).average();
		System.out.println("average():"+average.getAsDouble());
		//count: eleman sayisi
		long count = Arrays.stream(array4).count();
		System.out.println("Count: "+count);
		
		//max-min
		OptionalInt max = Arrays.stream(array4).max();
		OptionalInt min = Arrays.stream(array4).min();
		System.out.println("Max(): "+ max.getAsInt()+"  min(): "+min.getAsInt());
		
		//9. Arrays.asList: Bir array'i List'e çevirme:
		int[] array7={8,2,5,6};
		List<int[]> list = Arrays.asList(array7);
		System.out.println(list);
		
		Integer[] array8={8,2,5,6};
		List<Integer> list1 = Arrays.asList(array8);
		System.out.println(list);
		
		//10
		int[][] ikiBoyutluDizi= {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12}
		};
		System.out.println(Arrays.toString(ikiBoyutluDizi));
		System.out.println("-------------------------------");
		System.out.println(Arrays.deepToString(ikiBoyutluDizi));
		System.out.println("---------------------------------");
		
		for (int[] satir:ikiBoyutluDizi){
			for(int item:satir){
				System.out.println(item);
			}
		}
		
		
		
		
	}
}