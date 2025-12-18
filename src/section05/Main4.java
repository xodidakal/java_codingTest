package section05;

import java.util.Scanner;
import java.util.Stack;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        Stack<Integer> stack = new Stack<>();

        for(char c : input.toCharArray()) {
            int num1 = 0;
            int num2 = 0;
            switch (c) {
                case '+':
                    num1 = stack.pop();
                    num2 = stack.pop();
                    stack.push(num2+num1);
                    break;
                case '-':
                    num1 = stack.pop();
                    num2 = stack.pop();
                    stack.push(num2-num1);
                    break;
                case '*':
                    num1 = stack.pop();
                    num2 = stack.pop();
                    stack.push(num2*num1);
                    break;
                case '/':
                    num1 = stack.pop();
                    num2 = stack.pop();
                    stack.push(num2/num1);
                    break;
                default:
                    stack.push(Character.getNumericValue(c));
                    break;
            }
        }

        System.out.println(stack.pop());
    }
}
