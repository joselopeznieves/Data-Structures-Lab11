package mergeToArray;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int arr1Size = input.nextInt();
		int[] arr1 = new int[arr1Size];
		for(int i = 0; i < arr1Size; i++){
			arr1[i] = input.nextInt();
		}
		
		int arr2Size = input.nextInt();
		int[] arr2 = new int[arr2Size];
		for(int i = 0; i < arr2Size; i++){
			arr2[i] = input.nextInt();
		}
		
		int[] result = mergeArrays(arr1, arr2);
		
		for(int num : result)
			System.out.print(num + " ");
		System.out.println();
		
		input.close();
		
		
	}
	
	public static int[] mergeArrays(int[] arr1, int [] arr2){
		
		int[] result = new int[arr1.length + arr2.length];
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < arr1.length && j < arr2.length){
			
			if(arr1[i] <= arr2[j]){
				result[k] = arr1[i];
				i++;
				k++;
			}
			else{
				result[k] = arr2[j];
				j++;
				k++;
			}
					
		}
		while(i < arr1.length){
			result[k] = arr1[i];
			i++;
			k++;
		}
		while(j < arr2.length){
			result[k] = arr2[j];
			j++;
			k++;
		}
		
		return result;
	}
}
