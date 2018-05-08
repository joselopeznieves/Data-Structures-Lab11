package heapSort;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		int[] inputArray = new int[size];  
		for(int i = 0; i < size; i++)
			inputArray[i] = input.nextInt();
		input.close();
		
		sort(inputArray);
		
		for(int i : inputArray) 
			System.out.print(i + " ");
		System.out.println();

	}

	public static void sort(int[] arr) {
		
		int size = arr.length;
		for(int root = (size - 2)/2; root >= 0; root--)
			downHeap(arr, root, size);
		
		for(int i = size-1; i> 0; i--) {
			swap(arr, i, 0);
			downHeap(arr, 0, i);
		}
			
		
	}
	
	public static void downHeap(int[] arr, int root, int size) {
		boolean isHeap = false;
		
		while(!isHeap && 2*root+1 < size) {
			int min = 2*root+1;
			if(2*root+2 < size) {
				if(arr[2*root+2] > arr[min])
					min = 2*root+2;
			}
			if(arr[root] < arr[min]) {
				swap(arr, root, min);
				root = min;
			}
			else {
				isHeap = true;
			}
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
