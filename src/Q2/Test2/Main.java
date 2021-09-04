package Q2.Test2;/// 보이는 학생

///선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input1 = in.nextInt();
		String[] array = new String[input1];////왜 인티저로 안 받았을까???
		for(int i = 0 ; i < input1; i++) {
			array[i] = in.next();
		}
		
		int tmp = 0, count = 0;
		for(String x : array) {
			if(Integer.parseInt(x) > tmp ) {
				count++;
				tmp = Integer.parseInt(x);///제일 큰 값
			}
		}
		System.out.println(count);
		in.close();
		return;
		
	}

}
