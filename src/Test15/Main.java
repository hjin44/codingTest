package Test15;
/////가위바위보
//A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
//1 가위  2바위 3보

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input1 = in.nextInt();
		
		int[] input2 = new int[input1];
		int[] input3 = new int[input1];
		
		for(int i = 0; i < input1; i++) {
			input2[i] = in.nextInt();
		}
		for(int i = 0; i < input1; i++) {
			input3[i] = in.nextInt();
		}
		
		for(int i=0; i<input1; i++) {
			if(input2[i] == input3[i]) {
				System.out.println("D");
			}else if(input2[i]-input3[i] == 1 || input2[i]-input3[i] == -2) {
				System.out.println("A");
			}else {
				System.out.println("B");
			}
		}
		
		
		in.close();
		return;
	}

}
