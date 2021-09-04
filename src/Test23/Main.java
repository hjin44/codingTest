package Test23;////2단원 11번 임시반장 정하기

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
		int count = 0, tmp=0, max=0;
		for(int i = 1 ; i <= input1; i++) {
			for(int j = 1 ; j <= input1; j++) {
				for(int k =1 ; k <= 5; k++) {
					if(input2[i][k] == input2[j][k]) {
						count++;
						break;
					}
				}
			}
			if(count > tmp) {
				tmp = count;
				max = i;
			}
			count=0;
		}
		System.out.print(max);
		in.close();
		return;
		
	}

}
