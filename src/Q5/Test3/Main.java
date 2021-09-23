package Q5.Test3;//// 크레인 인형뽑기(카카오)

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arraySize = in.nextInt();
		int[][] array = new int[arraySize][arraySize];
		for(int i = 0; i<arraySize; i++) {
			for(int k = 0; k<arraySize; k++) {
				array[i][k] = in.nextInt();
			}
		}
		
		int moveSize = in.nextInt();
		int[] move = new int[moveSize];
		Stack<Integer> stack = new Stack<Integer>();
		int count=0;
		for(int m = 0; m<moveSize; m++) {
			move[m] = in.nextInt();
			
			for(int i = 0; i<arraySize; i++) {
				if(array[i][move[m]-1] != 0) { /////입력 받은 위치에서 0값이 아닌 곳을 찾고
					if(!stack.empty()) {
						int tmp = stack.pop();
						if(array[i][move[m]-1] == tmp) {
							count = count + 2;
							array[i][move[m]-1] = 0;
							break;
						}else {
							stack.push(tmp);
							stack.push(array[i][move[m]-1]);
							array[i][move[m]-1] = 0;
						}
					}else { ////스택이 비어있으면 인형을 넣어주고 배열에서는 제거
						stack.push(array[i][move[m]-1]);
						array[i][move[m]-1] = 0;
					}
					break;
				}
			}
		
		}
		System.out.print(count);
		in.close();
		return;
		

	}

}
