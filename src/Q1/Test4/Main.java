package Q1.Test4;/////단어 뒤집기

////N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        String[] input = new String[number];
        String[] output = new String[number];
        
        for(int i = 0; i < number; i++){
            input[i] = in.next();
        }
        for(int i = 0; i < number; i++){
            String out = "";
            for(int j = input[i].length()-1; j >= 0 ; j--){
                out = out + input[i].charAt(j);
                output[i] = out;
            }
        }
        for(int i = 0; i < output.length ; i++){
            System.out.println(output[i]);
        }

        in.close();
	}

}
