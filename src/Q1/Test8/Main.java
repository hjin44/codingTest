package Q1.Test8;/////유효한 팰린드롬

/////앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.

///문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.

///단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.

///알파벳 이외의 문자들의 무시합니다.

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        input = input.toUpperCase(Locale.ROOT);


        String text = "";
        for (int i = 0; i < input.length(); i++){
            if (Pattern.matches("^[a-zA-Z]*$",Character.toString(input.charAt(i)))){
                text += input.charAt(i);
            }
        }
        String output = "";
        for (int i = text.length()-1; i > -1 ; i--){
            output += text.charAt(i);
        }
        if (text.equals(output)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
        in.close();
        return;

    }
}