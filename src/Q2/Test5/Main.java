package Q2.Test5;//// 소수(에라토스테네스 체)

////자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.

///만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int input1 = in.nextInt();
		
		int[] arr = new int[input1+1];////숫자 20을 확인하기 위해서 +1
		/////배열을 만들고 초기화를 안하면 기본값은 0으로 설정됨
		int count = 0;
		
		for(int i = 2; i <= input1 ; i++) {
			/////2일 경우
			if(arr[i]==0) {
				count++;////2자리에 0이 있으니 소수
				for(int j = i; j <= input1; j=j+i) {
					////4, 6, 8, .... 자리에 1 입력
					arr[j] = 1;
				}
			}
		}
		
		System.out.println(count);
		in.close();
		return;
	}

}
