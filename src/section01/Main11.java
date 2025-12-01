package section01;

import java.util.Scanner;

// 실패
public class Main11 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input1 = in.next();


        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(char c: input1.toCharArray()){
            if(sb.length() ==  0) {
                sb.append(c);
                continue;
            }

            // 내가 짠 코드 문제
            // 1. 성능상 substring 사용할 경우 계속 객체를 새로 생성하는 작업이라 속도가 느려짐
            // if(!sb.substring(sb.length() - 1).equals(String.valueOf(c))) {
            //     if(count > 1) {
            //         sb.append(count);
            //         count = 1;
            //     }
            //     sb.append(c);
            // }else {
            //     count++;
            // }

            if(sb.charAt(sb.length() - 1) == c) {
                count++;
            }else {
                if(count > 1) {
                    sb.append(count);
                }
                count = 1;
                sb.append(c);
            }

        }

        // 내가 짠 코드 문제
        // 2. 마지막 중복 카운트는 출력하고 있지 않아 출력이 필요함
        if(count > 1) sb.append(count);

        System.out.println(sb.toString());
    }
}
