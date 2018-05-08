package quickSort;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		int[] inputArray = new int[size];  
		for(int i = 0; i < size; i++)
			inputArray[i] = input.nextInt();
		input.close();
		
		sort(inputArray, 0, inputArray.length -1);
		
		for(int i : inputArray) 
			System.out.print(i + " ");
		System.out.println();
	}
	

	public static void sort(int[] arr, int low, int high) {
		
		if( low < high) {
			
			int partition = partitions(arr, low, high);
			
			sort(arr, low, partition -1);
			sort(arr, partition + 1, high);
			
		}
	}
	
	public static int partitions(int[] arr, int low, int high) {
		int left = low, right = high - 1, pivot = arr[high]; 
		
		while( left <= right) {
			while(left <= right && arr[left] <= pivot) {
				left++;
			}
			while(left <= right && arr[right] >= pivot) {
				right--;
			}
			
			if(left < right) {
				swap(arr, left, right);
				left++;
				right--;
			}
		}
		
		swap(arr, left, high);
		
		return left;
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
