package Test24;////2단원 12번 멘토링

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int input1 = in.nextInt();
		int input2 = in.nextInt();
		int[][] input3 = new int[input1][input2];
		for(int i = 0 ; i < input1; i++) {
			for(int j = 0 ; j < input2; j++) {
				input3[i][j] = in.nextInt();
			}
		}
		for(int i = 1 ; i < input1; i++) {
			for(int j = 1 ; j < input1; j++) {
				
				for(int k = 0; k < input2; k++) {
					if(input3[i][k]>input3[j][k]) {

					}
				}
				
				////////i j k s
				/////arr[k][s]==i => pi=s
				/////arr[k][s]==j => pj=s
			}
		}
				
	}

}
