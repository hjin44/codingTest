package Q1.Test1;///문자 찾기
//한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
//대소문자를 구분하지 않습니다.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.nextLine();

        int count = 0;

        /////단어에서 한 글자씩 가져와야되고 대소문자 구분이 없어야하니까
        for (int i = 0 ; i < input1.length(); i++){
            if (input1.substring(i,i+1).equalsIgnoreCase(input2)){
                count++;
            }
        }
        System.out.println(count);

        in.close();
	}

}
