package sort;

public class StrategyContext {
	private SortStrategy S;
	public SortStrategy setStrategy(String sortType, int arr[], int size) {
		if(sortType == "Insertion" || sortType == "insertion")
			S = new InsertionSort(arr, size);
		else if(sortType == "Bubble" || sortType == "bubble")
			S = new BubbleSort(arr, size);
		else
			System.out.println("Wrong Entry!");
		return S;
	}
}
