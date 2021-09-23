package Q5.Test1;/// 올바른 괄호
///괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
//(())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
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
