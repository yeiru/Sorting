package sorting;

public class TestSorting {

	static final int tam = 30;

	public static void main(String args[]) {

		int array[] = new int[tam];
		int sortedArray[];
		Reader reader = new Reader(args[0]);
		for(int x = 0; reader.hasInt(); x++) {
			array[x] = reader.nextInt();			
		}

		//sortedArray = Sorting.selectionSort(array);
		//sortedArray = Sorting.insertionSort(array);
		sortedArray = Sorting.mergeSort(array);
		for(int x = 0; x < tam; x++) {
			System.out.println(sortedArray[x]);
		}
	}
}