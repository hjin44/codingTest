package Q4.Test3;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int in1 = in.nextInt();
		int in2 = in.nextInt();
		int[] in3 = new int[in1];
		for(int i = 0; i<in1; i++) {
			in3[i] = in.nextInt();
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i<in2-1; i++) {
			map.put(in3[i], map.getOrDefault(in3[i], 0)+1);
		}
		
		int lt = 0;
		for(int rt = in2-1; rt<in1; rt++) {                                 
			
			map.put(in3[rt], map.getOrDefault(in3[rt], 0)+1);
			System.out.print(map.size() + " ");
			map.put(in3[lt], map.get(in3[lt])-1);
			if(map.get(in3[lt]) == 0) map.remove(in3[lt]);
			lt++;
		}

		in.close();
		return;

	}

}
