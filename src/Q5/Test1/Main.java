package Q5.Test1;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String in1 = in.nextLine();
        //스택 사용 문제 last in first out
        //push() pop()
        
        Stack<Character> stack = new Stack<>();
        for(char x : in1.toCharArray()){
            if(x == '('){
                stack.push(x);
            }else{
                if(stack.isEmpty()){
                    System.out.println("NO");
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()) System.out.println("NO");
        else System.out.println("YES");
	}

}
