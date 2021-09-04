package Test17;

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
