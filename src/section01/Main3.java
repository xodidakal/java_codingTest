package section01;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        // split 사용하기
        // String answer = "";
        // Scanner in=new Scanner(System.in);
        // String input1 = in.nextLine();

        // String[] list = input1.split(" ");

        // int max = 0;
        // for(String text : list){
        //     if(max < text.length()) {
        //         max = text.length();
        //         answer = text;
        //     }
        // }

        // System.out.println(answer);

        // indexOf() 와 substring() 사용하기
        String answer = "";
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();

        int max = Integer.MIN_VALUE, pos;

        while ((pos=input1.indexOf(" ")) != -1) {
            String tmp = input1.substring(0, pos);
            if(tmp.length() > max) {
                max = tmp.length();
                answer = tmp;
            }
            input1 = input1.substring(pos+1);
        }

        if(input1.length() > max){
            answer = input1;
        }

        System.out.println(answer);
    }
}
