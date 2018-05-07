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
		
	}
}
