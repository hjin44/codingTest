package Q4.Test6;//// 최대 길이 연속부분수열

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int in1 = in.nextInt();
		int in2 = in.nextInt();
		int[] in3 = new int[in1];
		for(int i = 0; i < in1; i++) {
			in3[i] = in.nextInt();
		}
		
		int lt = 0, answer = 0, cnt = 0, leg = 0;
		for(int rt = 0; rt < in1; rt++) {
			if(in3[rt] == 0) {
				cnt++;
				while(cnt > in2) {
					if(in3[lt] == 0) cnt--;
					lt++;
				}
			}
			leg = rt - lt + 1;
			answer = Math.max(leg, answer);
		}
		System.out.println(answer);
		in.close();
		return;
	}

}
