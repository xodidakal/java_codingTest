package section01;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();
        input = input.toLowerCase();

        // 내가 짠 코드 : String으로 문자를 합치게 되면 합쳐질 때마다 객체를 생성하여
        // 성능이 좋은 코드는 아님
        // String answer = "";
        // for (char c: input.toCharArray())
        // {
        //     if(Character.isAlphabetic(c)) answer += c;
        // }


        // String reversed = new StringBuilder(answer).reverse().toString();

        // if(answer.equals(reversed)) System.out.println("YES");
        // else System.out.println("NO");

        // AI 성능 개선한 버전
        StringBuilder answer = new StringBuilder();
        for(char c : input.toCharArray()){
            if(Character.isLetter(c)) answer.append(c);
        }
        String origin = answer.toString();
        String reserved = new StringBuilder(origin).reverse().toString();

        if(answer.toString().equals(reserved)) System.out.println("YES");
        else System.out.println("NO");

    }
}
