package section01;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        String[] input = new String[input1];

        // 직접 뒤집기
        // for(int i = 0; i < input1; i++){
        //      String text = in.next();
        //      input[i] = "";
        //      for(int j = text.length() -1 ; j >= 0; j--) {
        //         input[i] += text.charAt(j);
        //      }
        // }

        //StringBuilder 의 reverse() 메소드 사용하기
        for(int i = 0; i < input1; i++){
             String text = in.next();
             String tempText = new StringBuilder(text).reverse().toString();
             input[i] = tempText;
        }

        for(String text : input){
            System.out.println(text);
        }
    }
}
