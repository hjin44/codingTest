package Q1.Test5;///특정 문자 뒤집기

////영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,

////특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String input1 = in.nextLine();
		
		int size = input1.length()-1;
		char[] text = input1.toCharArray();
		
		for(int i = 0; i < input1.length(); i++) {
			
            if (input1.length()/2 <= i){            
                break;
            }
			
			if(Pattern.matches("^[a-zA-Z]*$", Character.toString(text[i]))) {
				
				for(int j = size; j > -1; j--) {
					if(Pattern.matches("^[a-zA-Z]*$", Character.toString(text[j]))) {
		                char tmp = text[j];////맨 뒤
		                text[j] = text[i];
		                text[i] = tmp;
		                size = size-1;		             
		                break;
					}else {
						size = size-1;
					}
				}
			}
		}
		System.out.println(text);
		in.close();
	}

}
