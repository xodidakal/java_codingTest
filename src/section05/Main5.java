package section05;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();

        Stack<Character> stack = new Stack<>();
        int answer = 0;
        char prev = ' ';

        for(char c : input.toCharArray()) {
            if(c == '(') {
                // stack에 추가
                stack.push(c);
            }else if(c == ')') {
                stack.pop();
                if(prev == '(') {
                    answer += stack.size();
                }else {
                    answer++;
                }
            }

            prev = c;
        }

        System.out.println(answer);
    }
}
