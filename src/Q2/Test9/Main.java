package Q2.Test9;/////격자판 최대합
///N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int input1 = in.nextInt();
		int[][] input2 = new int[input1][input1];
		for(int i = 0; i < input1; i++) {
			for(int j = 0; j < input1 ; j++) {
				input2[i][j] = in.nextInt();
			}
		}
		
		int answer = 0, sum1 = 0, sum2 = 0;
		
		for(int i = 0; i < input1; i++) {
			int sumX = 0, sumY = 0;
			for(int j = 0; j < input1 ; j++) {
				sumX += input2[i][j];
				sumY += input2[j][i];
			}
			answer = Math.max(sumX, answer);
			answer = Math.max(sumY, answer);
		}
		
		for(int i = 0; i < input1; i++) {
			sum1 += input2[i][i];
			sum2 += input2[i][input1-i-1];			
		}

		answer = Math.max(sum1, answer);
		answer = Math.max(sum2, answer);
		
		System.out.print(answer);
		
		
		in.close();
		return;
	}

}
