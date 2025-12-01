package section01;

import java.util.Scanner;

// 실패
public class Main10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        char c = in.next().charAt(0); // 단일 문자로 제한

        StringBuilder s = new StringBuilder();

        for(int i=0; i<input1.length(); i++){
            int index = -1;  // 루프마다 초기화
            int min = Integer.MAX_VALUE;
            // index("발견문자", "시작인덱스")
            // 루프를 돌 때 e를 발견하고 e를 발견한 다음 index 부터 다시 루프 돌면서 e를 찾는다.
            while ((index = input1.indexOf(c, index+1)) != -1) {
                int temp = Math.abs(index - i);
                if(min > temp) min = temp;
            }

            s.append(min + " ");
        }

        System.out.println(s.toString());

    }
}
