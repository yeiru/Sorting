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

		//sortedArray = Sorting.SelectionSort(array);
		sortedArray = Sorting.InsertionSort(array);
		for(int x = 0; x < tam; x++) {
			System.out.println(sortedArray[x]);
		}
	}
}