package section01;

import java.util.Scanner;

// 실패
public class Main5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input1 = in.next();

        char[] c = input1.toCharArray();
        int lt = 0;
        int rt = input1.length()-1;

        while(lt<rt){
            if(!Character.isAlphabetic(c[lt])){
                lt++;
            }else if(!Character.isAlphabetic(c[rt])){
                rt--;
            }else {
                char temp = c[lt];
                c[lt] = c[rt];
                c[rt] = temp;
                lt++;
                rt--;
            }
        }


        System.out.println(String.valueOf(c));
    }
}
