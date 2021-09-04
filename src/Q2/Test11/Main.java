package Q2.Test11;///임시반장 정하기

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int input1 = in.nextInt();
		int[][] input2 = new int[input1+1][6];
		for(int i = 1 ; i <= input1; i++) {
			for(int j = 1 ; j <= 5; j++) {
				input2[i][j] = in.nextInt();
			}
		}
		////여기까지 입력 받기
		
		int count = 0, tmp=0, maxStudent=0;
		for(int i = 1 ; i <= input1; i++) {///1번 학생과
			for(int j = 1 ; j <= input1; j++) {////다른 학생을 비교
				for(int k =1 ; k <= 5; k++) {///학년
					if(input2[i][k] == input2[j][k]) {
						count++;
						break; ////1명과 여러번 같은 반이 되어도 카운트는 1만 증가하기 때문에
					}
				}
			}
			if(count > tmp) {
				tmp = count;
				maxStudent = i;
			}
			count=0;
		}
		System.out.print(maxStudent);
		in.close();
		return;
		
	}

}
