package Q2.Test1;/////큰 수 출력하기

////N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.

////(첫 번째 수는 무조건 출력한다)

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input1 = in.nextInt();
		int[] input2 = new int[input1];
		
		int tmp = 0;
		for(int i = 0; i<input1; i++) {
			input2[i] = in.nextInt();
			/////if(x > tmp) {
			////System.out.print(x + " ");
			///}
			////tmp = x;
		}
		
		
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
