package Q1.Test6;///중복문자제거

///소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.

///중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        ArrayList<Character> list = new ArrayList<>();
        String output = "";

        for (char x : input.toCharArray()){
            if (!list.contains(x)){
                list.add(x);
                output += x;
            }
        }
        in.close();
        System.out.println(list);
	}

}
