package section02;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t = in.nextInt();
        int[] input = new int[t];
        StringBuilder answer = new StringBuilder();

        for(int i=0; i<t; i++) {
            input[i] = in.nextInt();
        }

        // 내가 짠 코드
        // for(int i =0 ; i<input.length; i++) {
        //     String text = new StringBuilder(String.valueOf(input[i])).reverse().toString();
        //     int num = Integer.parseInt(text);

        //     boolean isPrime = true;
        //     for(int j = 2; j < num; j++){
        //         if(num != 2 && num%j ==0) {
        //             isPrime = false;
        //             break;
        //         }
        //     }

        //     if(num != 1 && isPrime) answer.append(num+" ");
        // }

        // AI 코드 : 속도 개선
        for(int i = 0; i < input.length; i++) {
            String text = new StringBuilder(String.valueOf(input[i])).reverse().toString();
            int num = Integer.parseInt(text);

            if (num <= 1) continue;
            boolean isPrime = true;

            // sqrt(num)까지만 확인
            // 예로 num 이 36일 때
            // 36의 약수는 1 * 36, 2 * 18, 3 * 12, 4 * 9, 6 * 6
            // 여기서 작은 약수들은 1,2,3,4,5,6 즉 squrt(36) = 6 이하임
            // 따라서 소수인지를 체크할 때에는 입력받은 숫자의 제곱근이하까지 나눴을 때 0인지를 체크하면 됨
            // num 이 10만 이상일 때는 전체를 루프돌리면 time limit 에러가 발생
            // j * j <= num 이므로 num 이 36일 경우 j는 6까지만 돌리게 된다.
            for(int j = 2; j * j <= num; j++){
                if(num % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) answer.append(num).append(" ");

        }

        System.out.println(answer.toString());

    }
}
