package Q4.Test2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String in1 = in.nextLine();
		String in2 = in.nextLine();
		
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		
		for(char key : in1.toCharArray()) {
			map1.put(key, map1.getOrDefault(key, 0)+1);
		}
		for(char key : in2.toCharArray()) {
			map2.put(key, map2.getOrDefault(key, 0)+1);
		}
		int count = 0;
		for(Character key : map1.keySet()) {
			if(map2.containsKey(key)) {

				if(map1.get(key) == map2.get(key)) {
					count++;
				}
			}
		}
		if(count == map1.size()) {
			System.out.print("YES");
		}else {
			System.out.print("NO");
		}
		in.close();
		return;
	}

}
