package Q3.Test1;///두 배열 합치기
///오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int in1 = in.nextInt();
		ArrayList<Integer> out = new ArrayList<Integer>();
		
		for(int i = 0; i<in1; i++) {
			out.add(in.nextInt());
		}
		int in2 = in.nextInt();
		for(int i = 0; i<in2; i++) {
			out.add(in.nextInt());
		}

		Collections.sort(out);
		
		for(int i = 0; i<out.size(); i++) {
			System.out.print(out.get(i) + " ");	
		}
		
		in.close();
		return;
		
	}

//	두 배열을 읽어오면서 작은 수부터 배열에 넣는 방법
//	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
//		ArrayList<Integer> answer = new ArrayList<>();
//		int p1=0, p2=0;
//		while(p1<n && p2<m){
//			if(a[p1]<b[p2]) answer.add(a[p1++]);///a배열이 작은경우
//			else answer.add(b[p2++]);////b배열이 작은경우
//		}
//		while(p1<n) answer.add(a[p1++]);///p1이 남아 있는 경우
//		while(p2<m) answer.add(b[p2++]);
//		return answer;
//	}
//
//	public static void main(String[] args){
//		Main T = new Main();
//		Scanner kb = new Scanner(System.in);
//		int n=kb.nextInt();
//		int[] a=new int[n];
//		for(int i=0; i<n; i++){
//			a[i]=kb.nextInt();
//		}
//		int m=kb.nextInt();
//		int[] b=new int[m];
//		for(int i=0; i<m; i++){
//			b[i]=kb.nextInt();
//		}
//		for(int x : T.solution(n, m, a, b)) System.out.print(x+" ");
//	}
}
