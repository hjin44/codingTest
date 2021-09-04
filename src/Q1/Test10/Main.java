package Q1.Test10;////가장 짧은 문자거리

///한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input1 = in.next();
		String input2 = in.next();
		
		int tmp = 1000;
		int[] output = new int[input1.length()];
		for(int i = 0; i<input1.length(); i++) {
			if(input1.charAt(i) == input2.charAt(0)) {
				tmp = 0;
				output[i] = tmp;
			}else {
				tmp++;
				output[i] = tmp;
			}
		}
		////한쪽씩 돌아가면서 확인
		tmp = 1000;
		for(int i = input1.length()-1; i>-1; i--) {
			if(input1.charAt(i) == input2.charAt(0)) {
				tmp = 0;
				output[i] = tmp;
			}else {
				if(tmp < output[i]) {
					tmp++;
					output[i] = tmp;
				}
			}
		}
		for(int i = 0; i<input1.length(); i++) {
			System.out.print(output[i] + " ");	
		}
		
		in.close();
		return;

	}

}
