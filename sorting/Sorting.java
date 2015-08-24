package sorting;

public class Sorting {
	
	public static int[] selectionSort(int[] array) {		
		int tam = array.length;
		int min;
		int aux;
		for(int i = 0; i < tam; i++) {
			min = i;
			for(int j = i+1; j < tam; j++) {
				if(array[min] > array[j]) {
					min = j;
				}
			}
			aux = array[i];
			array[i] = array[min];
			array[min] = aux;
		}
		return array;
	}

	public static int[] insertionSort(int[] array) {
		int tam = array.length;
		int aux;
		int min;
		for(int i = 1; i < tam; i++) {
			min = i-1;
			for(int j = i; j > 0 && array[j] < array[min]; j--) {
				aux = array[j];
				array[j] = array[min];
				array[min] = aux;
				min--;
			}
		}
		return array;
	}

	public static int[] mergeSort(int[] array) {
		
		return array;
	}

	public static int[] quickSort(int[] array) {
		int length = array.length;
		if(length == 1)
			return array;
		int pivot = (length-1)/2;
		int value = array[pivot];
		int aux;
		int i = 0, j = length-1;
		while(i < j) {
			while(i < pivot) {
				if(array[i] >= value) {
					break;
				}
				++i;
			}
			while(j > pivot) {
				if(array[j] < value) {
					break;
				}
				--j;
			}
			aux = array[j];
			array[j] = array[i];
			array[i] = aux;
		}
		quickSort(Array.copyOfRange(array, 0, pivot-1));
		quickSort(Array.copyOfRange(array, pivot+1, length-1));
		return array;
	}

}