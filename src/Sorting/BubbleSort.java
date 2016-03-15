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
			for (int i = 0; i < unsortedArray.length - 1; i++) {
				if (unsortedArray[i] > unsortedArray[i + 1]) {
					swap(unsortedArray, i, i+1);

					swapped = true;
				}
			}
		} while (swapped);

		return unsortedArray;
	}

	private static void swap(int array[], int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
}
