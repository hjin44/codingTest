package Test16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input1 = in.nextInt();
		
		int[] arr = new int[input1+1];
		arr[0] = 1;
		int tmp = 0;
		for(int i = 0; i < input1; i++) {

			arr[i+1] = arr[i]+tmp;
			tmp = arr[i];
			System.out.print(arr[i] + " ");
		}
		
		
		in.close();
		return;
	}
}
