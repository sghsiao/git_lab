package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		boolean swapped;
		
		do { 
			swapped = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					Sorter.swap(array, i, i+1);
					swapped = true;
				}
			}
		} while (swapped);

		return array;
	}
}
