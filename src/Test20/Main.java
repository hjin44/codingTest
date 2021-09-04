package Test20;/////2단원 8번 등수 구하기

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int input1 = in.nextInt();
		int[] input2 = new int[input1];
		int[] answer = new int[input1];
		for(int i = 0 ; i < input1; i++) {
			input2[i] = in.nextInt();
		}
		
		for(int i = 0 ; i < input1; i++) {
			answer[i] = 1;
			for(int j = 0; j<input1; j++) {
				if(input2[i]<input2[j]){
					answer[i] = answer[i]+1;
				}
			}
			System.out.print(answer[i] + " ");
		}
		in.close();
		return;
		
	}

}
