package section01;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();

        StringBuilder answer = new StringBuilder();

        for(char c : input.toCharArray()){
            if(Character.isDigit(c)) answer.append(c);
        }

        // AI 개선 -> 안정성 추가 : 만약 입력받은 문자열에 숫자가 하나도 없을 경우
        // 그냥 paserInt를 하면 에러가 발생한다. 따라서 숫자가 있는지 체크부터 해야한다.
        if(answer.length() == 0) return;

        int result = Integer.parseInt(answer.toString());
        System.out.println(String.valueOf(result));
    }
}
