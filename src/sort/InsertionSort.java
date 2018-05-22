package sort;

public class InsertionSort extends SortStrategy{

	public InsertionSort(int arr[], int size) {
		setSize(size);
		initializeArr(size);
		setArr(arr, size);
	}
	
	@Override
	public void sort() {
		int array[] = new int[getSize()];
		array = getArr();
		for (int i = 1, j; i < getSize(); i++){
	         int tmp = array[i];
			      for (j = i; j > 0 && tmp < array[j - 1]; j--)
			    	  array[j] = array[j - 1];
			      array[j] = tmp;
	  }
		setArr(array, getSize());
	}

}
