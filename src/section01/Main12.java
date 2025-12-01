package section01;

import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t = in.nextInt();
        String input1 = in.next();

        input1 = input1.replace("#", "1").replace("*", "0");

        // 내가 짠 코드
        // 문제없이 돌아가긴 하나 성능 개선이 필요함
        // String[] list = new String[t];
        // int[] answer = new int[t];
        // StringBuilder sb = new StringBuilder();

        // for(int i=0; i<t; i++) {
        //     list[i] = input1.substring(i*7, (i+1)*7);
        //     int index = list[i].length() - 1;
        //     for(char c : list[i].toCharArray()) {
        //         answer[i] += Integer.parseInt(String.valueOf(c)) * Math.pow(2, index);
        //         index--;
        //     }

        //     sb.append(String.valueOf(((char) answer[i])));
        // }

        // AI가 짠 성능개선 코드
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<t; i++) {
            int value = 0;
            int start = i*7;

            for(int j = 0; j < 7; j++) {
                char c = input1.charAt(start+j);
                // (c - '0')
                // '0' - '0' = 0
                // '1' - '0' = 1
                // 즉 문자 -> 숫자(int)로 변환

                // (6 - j)
                // x << n 은 x를 2^n 배 한 값과 동일
                // 1 << 3 = 8 (1 * 2^3)
                value += (c - '0') << (6 - j);
            }

            sb.append((char) value);
        }

        // 강사님 코드에서 배운것
        // parseInt 를 통해 2진수 값을 int 값으로 변환
        int num = Integer.parseInt("1001", 2);
        System.out.println(num);

        System.out.println(sb.toString());
    }
}
