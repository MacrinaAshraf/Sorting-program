package sort;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		size = sc.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		StrategyContext S = new StrategyContext();

		System.out.println("\nInserion");
		SortStrategy sort = S.setStrategy("Insertion", arr, size);
		sort.sort();
		sort.printArr();
		
		System.out.println("\n\nBubble");
		sort = S.setStrategy("Bubble", arr, size);
		sort.sort();
		sort.printArr();
		
	}

}
