package Q3.Test5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int in1 = in.nextInt();
//		슬라이드창으로 해보려고 했으나 실패	
//		우선 배열에 1234.....넣고
//		int[] tmp = new int[in1];
//		for(int i = 0; i <= in1; i++) {
//			tmp[i] = i;
//		}	
		///슬라이드 하려고 했는데 실패
//		int lt = 1, sum = 0, answer = 0;
//		for(int i = 0; i < in1; i++) {
//			sum += tmp[i];
//			if(sum < in1) {
//				
//			}else if(sum == in1) {
//				answer++;
//				sum = sum - tmp[lt];
//				lt++;
//			}else if(sum > in1) {
//				sum = sum - tmp[lt];
//				lt++;
//			}
//		}
		int sum = 0, answer = 0;
		for(int i = 2; i < in1; i++) {
			for(int k = 1; k<=i; k++) {
				sum = sum + k;
			}
			sum = in1 - sum;
			if(sum < 0) {
				break;
			}
			if(sum%i == 0) {
				answer++;
			}
			sum = 0;
		}
		
		System.out.println(answer);
		in.close();
		return;
	}

//	쌤의 솔루션 수학
//	public int solution(int n) {
//		int answer = 0, cnt = 1;
//		n--;
//		while(n>0) {
//			cnt++;
//			n = n-cnt;
//			if(n%cnt == 0) answer++;
//		}
//		
//	}
//	
//	솔루션 two point
//	public int solution(int n){
//		int answer=0, sum=0;
//		int m=n/2+1;
//		int[] arr=new int[m];
//		for(int i=0; i<m; i++) arr[i]=i+1;
//		int lt=0;
//		for(int rt=0; rt<m; rt++){
//			sum+=arr[rt];
//			if(sum==n) answer++;
//			while(sum>=n){
//				sum-=arr[lt++];
//				if(sum==n) answer++; 
//			}
//		}
//		return answer;
//	}
//
//	public static void main(String[] args){
//		Main T = new Main();
//		Scanner kb = new Scanner(System.in);
//		int n=kb.nextInt();
//		System.out.print(T.solution(n));
//	}
}



