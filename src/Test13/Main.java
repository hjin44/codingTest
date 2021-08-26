package Test13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input1 = in.nextInt();
		int[] input2 = new int[input1];
		
		for(int i = 0; i<input1; i++) {
			input2[i] = in.nextInt();
		}
		
		int tmp = 0;
		for(int x : input2) {
			if(x > tmp) {
				System.out.print(x + " ");
			}
			tmp = x;
		}
		in.close();
		return;

	}

}
