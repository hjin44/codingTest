package Q1.Test2;///대소문자 변환
///대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//      Scanner in=new Scanner(System.in);
		//      int input1 = in.nextInt();
		//      int input2 = in.nextInt();
		//      System.out.println(input1 + input2);
		//      return ;
		
		Scanner in = new Scanner(System.in);
		String input1 = in.nextLine();
		String output = "";
		
		for (int i = 0; i < input1.length(); i++){
		  char tmp = input1.charAt(i);
		  
		  ////대문자인 경우
		  if((65 <= tmp) && (tmp <= 90)){
		      output += input1.substring(i, i+1).toLowerCase();
		  }else {
		      ////나머지 = 소문자
		      output += input1.substring(i, i+1).toUpperCase();
		  }
		}
		in.close();
		System.out.println(output);

	}

}
