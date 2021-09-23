package Q4.Test1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int in1 = in.nextInt();
		String in2 = in.next();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char x : in2.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		char answer = ' ';
		int max = Integer.MIN_VALUE;
		for(char key : map.keySet()) {
			
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		System.out.println(answer);
		in.close();
		return;
		
		
	}

}
