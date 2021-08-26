package Test14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input1 = in.nextInt();
		String[] array = new String[input1];
		for(int i = 0 ; i < input1; i++) {
			array[i] = in.next();
		}
		
		int tmp = 0, count = 0;
		for(String x : array) {
			if(Integer.parseInt(x) > tmp ) {
				count++;
				tmp = Integer.parseInt(x);
			}
		}
		System.out.println(count);
		in.close();
		return;
		
	}

}
