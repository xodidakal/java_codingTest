package section05;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        Stack<Character> stack = new Stack<>();

        for(char c : input.toCharArray()) {
            if(c == ')') {
                // ( 을 만나기 전까지 while 문 동작
                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop();
                }

                // (도 삭제
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }

        for(Character c : stack.toString().toCharArray()){
            if(Character.isLetter(c)) System.out.print(c);
        }

    }
}
