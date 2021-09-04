package Test19;/////2단원 7번 점수계산 ----다시 풀어보기

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        
        int input2 = 0, sum = 0, count = 0;
        for(int i = 0; i < input1 ; i++){
            input2 = in.nextInt();
            if(input2 == 1){
                count++;
            }else{////input2 == 0
                if(count != 1){
                    for(int j = 1; j <= count; j++){
                        sum = sum + j;
                    }
                }else{
                    sum = sum + count;
                }
                
                count = 0;
            }
        }
        System.out.println(sum);
        in.close();
        return;
	}

}
