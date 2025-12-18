package section05;

import java.util.Scanner;
import java.util.Stack;

public class Main1 {
    public static void main(String[] args) {
        // 스택을 활용
        Scanner in = new Scanner(System.in);
        String input = in.next();
        Stack<Character> stack = new Stack<>();

        for(char c : input.toCharArray()) {
            if(c == '(') {
                stack.push(c);
            }else if (c == ')') {
                if(stack.isEmpty()) {
                    System.out.println("NO");
                    return;
                }else {
                    stack.pop();
                }
            }
        }

        System.out.println(stack.isEmpty() ? "YES" : "NO");

    }
}