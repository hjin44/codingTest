package Q3.Test4;//// 연속 부분수열
///N개의 수로 이루어진 수열이 주어집니다.

///이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.

///만약 N=8, M=6이고 수열이 다음과 같다면

///1 2 1 3 1 1 1 2

///합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
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
		int count = 0;
		for(int i = 0; i<in1; i++) {
			int sum = 0;
			for(int j = 0; j < in1; j++) {
				sum = sum + in3[i+j];
				if(sum == in2) {
					count++;
					sum = 0;
					break;
				}else if(sum > in2) {
					break;
				}
			}
			
		}
		System.out.print(count);
		in.close();
		return;
	}
//	
//	public int solution(int n, int m, int[] arr){
//		int answer=0, sum=0, lt=0;
//		for(int rt=0; rt<n; rt++){
//			sum+=arr[rt];
//			if(sum==m) answer++;
//			while(sum>=m){
//				sum-=arr[lt++];
//				if(sum==m) answer++; 
//			}
//		}
//		return answer;
//	}
//
//	public static void main(String[] args){
//		Main T = new Main();
//		Scanner kb = new Scanner(System.in);
//		int n=kb.nextInt();
//		int m=kb.nextInt();
//		int[] arr=new int[n];
//		for(int i=0; i<n; i++){
//			arr[i]=kb.nextInt();
//		}
//		System.out.print(T.solution(n, m, arr));
//	}
}
