package Q2.Test7;/////점수계산

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        
        int input2 = 0, sum = 0, count = 0;
        for(int i = 0; i < input1 ; i++){
            input2 = in.nextInt();
            if(input2 == 1){
                count++;
                sum = sum + count;
            }else{////input2 == 0
            	count = 0;
            }
        }
        System.out.println(sum);
        in.close();
        return;
	}

}
