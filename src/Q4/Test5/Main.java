package Q4.Test5;

import java.util.Arrays;
import java.util.Collections;
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
        for(int i = 0; i<in1; i++){
            for(int k =i+1; k<in1; k++){
                for(int t = k+1; t<in1; t++){
                    map.put(in3[i]+in3[k]+in3[t], map.getOrDefault(in3[i]+in3[k]+in3[t], 0)+1);  
                }
            }
        }
      Object[] mapkey = map.keySet().toArray();

        Arrays.sort(mapkey, Collections.reverseOrder());
        int count = 0;
        for(Object i : mapkey){
            count++;
            if(count == in2){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);    
        in.close();

                 
//		Scanner in = new Scanner(System.in);
//		int in1 = in.nextInt();
//		int in2 = in.nextInt();
//		int[] in3 = new int[in1];
//		for(int i = 0; i<in1; i++) {
//			in3[i] = in.nextInt();
//		}
//        int cnt=0;
//        //tSet.remove(143); 143 지워!
//        //tSet.first(); ///오름차순이면 가장 작은수 내림차순이면 가장 큰 수 출력
//        ///tSet.last();
//        for(int x : tSet){
//            cnt++;
//            if(cnt==in2) System.out.println(x);
//        }
//              
//        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for(int i = 0; i<in1; i++){
//            for(int k =i+1; k<in1; k++){
//                for(int t = k+1; t<in1; t++){
//                    map.put(i+k+t, map.getOrDefault(i+k+t, 0)+1);  
//                }
//            }
//        }
//      Object[] mapkey = map.keySet().toArray();
//        Arrays.sort(mapkey);
//        if(mapkey[in2-1] == null){
//            System.out.println(-1);    
//        }else{
//            System.out.println(mapkey[in2-1]);    
//        }
//        
//        System.out.println(-1);
//        in.close();
//        return;
	}

}
