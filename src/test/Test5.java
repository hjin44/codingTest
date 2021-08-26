package test;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String input1 = in.nextLine();
		
		int size = input1.length()-1;
		char[] text = input1.toCharArray();
		
		for(int i = 0; i < input1.length(); i++) {
			
            if (input1.length()/2 <= i){            
                break;
            }
			
			if(Pattern.matches("^[a-zA-Z]*$", Character.toString(text[i]))) {
				
				for(int j = size; j > -1; j--) {
					if(Pattern.matches("^[a-zA-Z]*$", Character.toString(text[j]))) {
		                char tmp = text[j];////맨 뒤
		                text[j] = text[i];
		                text[i] = tmp;
		                size = size-1;		             
		                break;
					}else {
						size = size-1;
					}
				}
			}
		}
		System.out.println(text);
		in.close();
	}

}
