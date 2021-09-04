package Q2.Test4;////피보나치 수열
///1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.

///2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input1 = in.nextInt();
		
		int[] arr = new int[input1+1];////
		arr[0] = 1;
		int tmp = 0;////앞에 0이 있다고 생각을 했다...
		for(int i = 0; i < input1; i++) {

			arr[i+1] = arr[i]+tmp;
			tmp = arr[i];
			System.out.print(arr[i] + " ");
		}
		
		
		in.close();
		return;
	}
}
