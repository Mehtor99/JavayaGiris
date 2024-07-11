package org.mehtor._07_Methods.sorular;

import java.util.Arrays;

public class Denemeler {
	
	
	public int[] siraliDizi (int[] dizi1){
		int[] yeniDizi = Arrays.copyOf(dizi1,dizi1.length);
		Arrays.sort(yeniDizi);
		return yeniDizi;
	}
	
}