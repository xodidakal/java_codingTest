package section01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// 실패
public class Main6 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        String answer = "";

        // StringBuilder() 와 Set 사용하기
        // Set<Character> s = new HashSet<>();
        // char[] c = input1.toCharArray();
        // StringBuilder answer = new StringBuilder();

        // for(char text : c){
        //     if(!s.contains(text)){
        //         s.add(text);
        //         answer.append(text);
        //     }

        // }

        //String의 indexOf 활용1
        char[] c = input1.toCharArray();
        for(char t : c) {
            if(answer.indexOf(String.valueOf(t)) == -1){
                answer += t;
            }
        }

        //String 의 indexOf 활용2
        for(int i = 0; i < input1.length(); i++){
            // indexOf는 문자가 처음 위치하는 인덱스 값을 나타낸다
            // 따라서 indexOf로 해당 문자가 처음 위치하는 인덱스와 현재 인덱스가 같다면
            // 해당 문자는 그 인덱스에서 처음사용된다는 의미이므로 값을 담는다.
            if(i == input1.indexOf(input1.charAt(i))){
                answer += input1.charAt(i);
            }
        }

        System.out.println(answer);

    }
}
