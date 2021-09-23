package Q4.Test4;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String in1 = in.nextLine();
		String in2 = in.nextLine();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char x : in2.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		
		////슬라이딩창 만듬
		HashMap<Character, Integer> tmp = new HashMap<Character, Integer>();
		char[] charIn1 = in1.toCharArray();
		for(int i = 0; i< in2.length()-1; i++) {
			tmp.put(charIn1[i], tmp.getOrDefault(charIn1[i], 0)+1);
		}
		
		int lt = 0, count=0;
		for(int rt = in2.length()-1; rt< in1.length(); rt++) {
			tmp.put(charIn1[rt], tmp.getOrDefault(charIn1[rt], 0)+1);
			if(tmp.equals(map)) {
				count++;
			}
			tmp.put(charIn1[lt], tmp.get(charIn1[lt])-1);
			if(tmp.get(charIn1[lt]) == 0) {
				tmp.remove(charIn1[lt]);
			}
			lt++;
		}
		System.out.println(count);
		in.close();
		return;

	}

}
