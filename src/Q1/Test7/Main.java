package Q1.Test7;////회문 문자열

///앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.

///문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.

///단 회문을 검사할 때 대소문자를 구분하지 않습니다.

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        input = input.toUpperCase(Locale.ROOT);

        String text = "";
        for (int i = input.length()-1; i > -1 ; i--){
            text = text + input.charAt(i);
        }

        if (text.equals(input)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
        in.close();
        return;
	}

}
