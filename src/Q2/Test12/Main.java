package Q2.Test12;////멘토링

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int input1 = in.nextInt();////학생수
		int input2 = in.nextInt();///테스트 수
		int[][] input3 = new int[input2][input1];
		//////     등수   1등   2등  3등  4등 
		//////1번 테스트      3   4  1  2
	    //////2번 테스트      4   3  2  1
	    //////3번 테스트      3   1  4  2
		for(int i = 0 ; i < input2; i++) {
			for(int j = 0 ; j < input1; j++) {
				input3[i][j] = in.nextInt();
			}
		}
		
		int count = 0, pi = 0, pj = 0;
		for(int i = 1 ; i <= input1; i++) {///배열 안에 학생 번호는 1부터 시작함
			for(int j = 1 ; j <= input1; j++) {
				////우선 
				for(int t = 0; t < input2; t++) {////테스트
					for(int r = 0; r<input1; r++) {///등수
						/////1번 테스트에서 등수를 돌면서 1번 학생을 찾아
						if(input3[t][r] == i) pi = r; ///pi에 1번 학생의 등수를 넣어
						if(input3[t][r] == j) pj = r; /// 2번 학생의 등수를 넣어
					}
					if(pi<=pj) {
						break;
					}
				}
				if(pi > pj) {
					count++;
				}
				
			}
		}
		System.out.println(count);
		in.close();
		return;
				
	}

}
