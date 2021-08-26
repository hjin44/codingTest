package Test17;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int input1 = in.nextInt();
		
		int[] arr = new int[input1+1];
		int count = 0;
		
		for(int i = 2; i <= input1 ; i++) {
			if(arr[i]==0) {
				count++;
				for(int j = i; j <= input1; j=j+i) {
					arr[j] = 1;
				}
			}
		}
		
		System.out.println(count);
		in.close();
		return;
	}

}
