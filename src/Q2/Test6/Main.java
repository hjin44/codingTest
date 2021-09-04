package Q2.Test6;/// 뒤집은 소수
///N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.

///예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.

///첫 자리부터의 연속된 0은 무시한다.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static boolean isPrime(int num) {
		if(num==1) return false;
		for(int i =2; i<num; i++) {
			if(num%i==0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int input1 = in.nextInt();
		int[] input2 = new int[input1];
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		for(int i = 0; i < input1; i++) {
			input2[i] = in.nextInt();
		}
		
		for(int i = 0; i < input1; i++) {
			int tmp = input2[i];
			int res = 0;
			////숫자 뒤집기
			while(tmp>0) {
				int t = tmp%10;
				res = res*10+t;
				tmp = tmp/10;
			}
			
			if(isPrime(res)) {////소수인지 확인
				answer.add(res);
				System.out.print(res + " ");
			}			
		}
//		System.out.println(answer);
		in.close();
		return;
	}


}
