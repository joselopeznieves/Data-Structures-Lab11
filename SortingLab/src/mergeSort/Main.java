package mergeSort;


import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		int[] inputArray = new int[size];  
		for(int i = 0; i < size; i++)
			inputArray[i] = input.nextInt();
		
		sort(inputArray);
		
		for(int num : inputArray) {
			System.out.print(num + " ");
		}
		
	
		input.close();

	}
	
	public static void sort(int[] arr) {
		sort(arr,new int[arr.length], 0, arr.length -1);
	}
	
	public static void sort(int[] arr, int[] temp, int lower, int upper) {
		
		if(lower < upper) {
			int mid = (lower + upper) / 2;
			
			sort(arr, temp,  lower, mid);
			sort(arr, temp,  mid + 1, upper);
			
			mergeSort(arr, temp, lower, mid, upper);
		}
	}
	
	public static void mergeSort(int[] arr, int[] temp, int lower, int mid, int upper) {
		for(int i = lower; i <= upper; i++) {
			temp[i] = arr[i];
		}
		
		int lowIndex = lower;
		int upperIndex = mid+1;
		int index = lower;
		
		while (lowIndex <= mid && upperIndex <= upper) {
			if(temp[lowIndex] <= temp[upperIndex]) {
				arr[index] = temp[lowIndex];
				lowIndex++;
			}
			else {
				arr[index] = temp[upperIndex];
				upperIndex++;
			}
			index++;
		}
		
		while(lowIndex <= mid) {
			arr[index] = temp[lowIndex];
			lowIndex++;
			index++;
		}
	}

}
