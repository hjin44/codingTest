package Q3.Test3;//// 최대 매출

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int in1 = in.nextInt();
		int in2 = in.nextInt();
		int[] in3 = new int[in1 + 100000];
		for(int i = 0; i<in1; i++) {
			in3[i] = in.nextInt();
		}
		int sum =0;
		for(int i = 0; i < in2; i++) {
			sum = sum + in3[i];	
		}
		
		int max = sum;
//		이중포문 사용하려고 했는데 시간초과함
//		for(int i = 0; i < in1; i++) {
//			for(int j = 0; j < in2 ; j++) {
//				sum = sum + in3[i+j];	
//			}
//			if(sum > max) {
//				max = sum;
//			}
//			sum = 0;
//		}
		for(int i = in2; i < in1; i++) {
			sum = sum - in3[i-in2] + in3[i];
			if(sum > max) {///max = Math.max(sum, max); 이거로 써도됨
				max = sum;
			}
			
		}
		
		System.out.print(max);
		in.close();
		return;
	}

}
