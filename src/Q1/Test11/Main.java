package Q1.Test11;////문자열 압축

////알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는

///문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.

///단 반복횟수가 1인 경우 생략합니다.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input1 = in.nextLine();
		String input2 = in.nextLine();
/////# =1   * =0    65 =A
		
		String tmp = "";
		String output = "";
		for(char x : input2.toCharArray()) {
			if(x == '#') {
				tmp += 1;
			}else{
				tmp += 0;
			}
			
			if(tmp.length()%7 == 0) {
				//output = Integer.parseInt(tmp)
				int i =0;
				
			}
		}
//		for(int i =0; i < input2.length(); i++) {
//			String out = tmp.substring(i, i+7);
//			System.out.println(out);
//			
//		}
		
		
		System.out.println(tmp);
		
		
		in.close();
		return;
	}

}
