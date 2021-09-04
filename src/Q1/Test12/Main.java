package Q1.Test12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input1 = in.nextInt();
		String input2 = in.next();

		//일단 2진수로 변환시키기
		String binary = "";
		for(char x : input2.toCharArray()) {
			if(x == '#') {
				binary += "1";
			}else {
				binary += "0";
			}
		}
		
		//그리고 7자씩 가져와야해
		String text = "";
		for(int i = 0 ; i < input1; i++) {
			text = binary.substring(0, 7);
			int decimal = Integer.parseInt(text,2);
			System.out.print((char)decimal);
			binary = binary.substring(7);
		}

		in.close();
		return;
	}

}
