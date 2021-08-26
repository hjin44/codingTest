package Test10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input1 = in.next();
		String input2 = in.next();
		
		int tmp = 1000;
		int[] output = new int[input1.length()];
		for(int i = 0; i<input1.length(); i++) {
			if(input1.charAt(i) == input2.charAt(0)) {
				tmp = 0;
				output[i] = tmp;
			}else {
				tmp++;
				output[i] = tmp;
			}
		}
		
		tmp = 1000;
		for(int i = input1.length()-1; i>-1; i--) {
			if(input1.charAt(i) == input2.charAt(0)) {
				tmp = 0;
				output[i] = tmp;
			}else {
				if(tmp < output[i]) {
					tmp++;
					output[i] = tmp;
				}
			}
		}
		for(int i = 0; i<input1.length(); i++) {
			System.out.print(output[i] + " ");	
		}
		
		in.close();
		return;

	}

}
