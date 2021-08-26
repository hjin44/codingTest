package Test11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input1 = in.nextLine();
		String input2 = in.nextLine();
/////# =1   * =0    65 =A
		
		String tmp = "";
		String output = "";
		for(char x : input2.toCharArray()) {
			if(x == '#') {
				tmp += 1;
			}else{
				tmp += 0;
			}
			
			if(tmp.length()%7 == 0) {
				//output = Integer.parseInt(tmp)
				int i =0;
				
			}
		}
//		for(int i =0; i < input2.length(); i++) {
//			String out = tmp.substring(i, i+7);
//			System.out.println(out);
//			
//		}
		
		
		System.out.println(tmp);
		
		
		in.close();
		return;
	}

}
