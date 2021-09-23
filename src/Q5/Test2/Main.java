package Q5.Test2;///괄호문자제거
////입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String in1 = in.nextLine();
		
		Stack<Character> stack = new Stack<Character>();
		
		for(char x : in1.toCharArray()) {
			if(stack.empty()) {
				if(x == '(') {
					stack.push(x);
				}else {
					System.out.print(x);
				}
			}else {
				if(x == '(') stack.push(x);
				else if(x == ')') stack.pop();
				
			}
		}

		in.close();
		return;
	}

}
