package sort;

public class BubbleSort extends SortStrategy{
	public BubbleSort(int arr[], int size) {
		setSize(size);
		initializeArr(size);
		setArr(arr, size);
	}
	
	@Override
	public void sort() {
		int array[] = new int[getSize()];
		array = getArr();
		int outer, inner;
		for (outer = array.length - 1; outer > 0; outer--) {  
		   for (inner = 0; inner < outer; inner++) { 
			   if (array[inner] > array[inner + 1]) {        
				   int temp = array[inner];        
				   array[inner] = array[inner + 1];         
				   array[inner + 1] = temp;      
				}      
		   }
		}
		setArr(array, getSize());
	}

}
