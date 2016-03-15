package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
		  // TODO Implement insertion sort
	  	int n = unsortedArray.length;
	  	for (int i = 1; i < n; i++){
			int curr = unsortedArray[i];
		  	int j = i-1;
		  	while (j >= 0 && unsortedArray[j] > curr){
				unsortedArray[j+1] = unsortedArray[j];
				j = j-1;
		  	}
		  	unsortedArray[j+1] = curr;
	  	}	
	  	return unsortedArray;
  	}
}
