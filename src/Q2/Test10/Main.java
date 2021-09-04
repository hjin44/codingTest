package Q2.Test10;///봉우리

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input1 = in.nextInt();
		int[][] input2 = new int[input1+2][input1+2];///가장자리 공간이 필요해서
		for(int i = 1 ; i <= input1; i++) {
			for(int j = 1 ; j <= input1; j++) {
				input2[i][j] = in.nextInt();
			}
		}
		
		int count = 0;
		int[] dx = {0, 1, 0, -1};////왼쪽 아래 오른쪽 위
		int[] dy = {-1, 0, 1, 0};
		for(int i = 1 ; i <= input1; i++) {
			for(int j = 1 ; j <= input1; j++) {
				int tmp = 0;
				for(int a = 0; a < 4; a++) {
					if(input2[i][j] <= input2[(i+dx[a])][(j+dy[a])]) {
						break;
					}else {
						tmp++;
					}
				}
				if(tmp == 4) {
					count++;	
				}
			}
		}
		System.out.println(count);
		in.close();
		return;
	}

}
