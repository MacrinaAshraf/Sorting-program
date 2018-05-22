package sort;

public abstract class SortStrategy {
	private int size;
	private int arr[];
	
	public SortStrategy(){ }
	
	public int getSize() {return size;}
	public void setSize (int size) {this.size = size;}
	
	public void printArr() {
		for(int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
	}
	public void setArr(int array[], int size) {
		for(int i = 0; i < size; i++)
			this.arr[i] = array[i];
	}
	public int[] getArr() { 
		int array[] = new int[size];
		for(int i = 0; i < size; i++)
			array[i] = arr[i];
		return array;
	}
	public void initializeArr(int size) {arr = new int[size];}
	
	public abstract void sort();
	
	
	
	
}
