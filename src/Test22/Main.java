package Test22;///2단원 10번 봉우리

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int input1 = in.nextInt();
		int[][] input2 = new int[input1][input1];
		for(int i = 0 ; i < input1; i++) {
			for(int j = 0 ; j < input1; j++) {
				input2[i][j] = in.nextInt();
			}
		}
	}

}
