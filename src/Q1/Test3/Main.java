package Q1.Test3;////문장 속 단어

///한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        
        String[] text = input1.split("\\s");
        
        int big = 0;
        String output = "";

        for(int i = 0; i < text.length ; i++){
            int length = text[i].length();
            if(length > big){
                big = length;
                output = text[i];
            }
        }
        System.out.println(output);
        in.close();
	}

}
