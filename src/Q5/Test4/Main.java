package Q5.Test4;////후위식 연산
///후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
///만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String in1 = in.nextLine();
		
		Stack<Integer> num = new Stack<Integer>();
		
		for(char x : in1.toCharArray()) {
			if(Character.isDigit(x) == false) {///연산자일 경우
				int tmp1 = num.pop();
				int tmp2 = num.pop();
				int res = 0;
				if(x == '+') res = tmp2+tmp1;
				else if(x == '-') res = tmp2-tmp1;
				else if(x == '*') res = tmp2*tmp1;
				else if(x == '/') res = tmp2/tmp1;
				
				num.push(res);				
			}else {///숫자일 경우
				num.push(Character.getNumericValue(x));
			}
		}
		
		System.out.print(num.pop());
		in.close();
		return;

	}

}
