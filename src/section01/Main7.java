package section01;

import java.util.Scanner;

// 다시 풀이 필요
public class Main7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input = in.next();

        input = input.toLowerCase();

        // 내가 짠 코드 -> 너무 복잡하고 난해함
        // 풀이 : input 을 반으로 갈라 앞글자와 뒷글자가 일치하는지 확인
        // int hflen = input.length() / 2;

        // String preText = input.substring(0, hflen);
        // String nextText = input.length() % 2 == 0 ? input.substring(hflen) : input.substring(hflen+1);

        // String temp = new StringBuilder(nextText).reverse().toString();
        // if(preText.equals(temp)) System.out.println("YES");
        // else System.out.println("NO");

        // AI 직관적 코드
        String reversed = new StringBuilder(input).reverse().toString();

        if(input.equals(reversed)) System.out.println("YES");
        else System.out.println("NO");

    }
}
