package section03;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int[] input1 = new int[n1];

        for(int i=0; i<n1; i++) {
            input1[i] =in.nextInt();
        }

        // 내가 짠 코드 : 이중 포문이 돌기 때문에 time Limit 에러 발생
        // O(n^2) 로 n1 이 10만이고 n2가 500 이면 타임 에러 발생
        // for(int i=0; i<n1-n2; i++) {
        //     int sum = 0;
        //     for(int j=0; j<n2; j++) {
        //         sum += input1[i+j];
        //     }
        //     if(sum > max) max = sum;
        // }

        // ****강사님 및 AI 코드 : 슬라이딩 윈도우 활용
        // n1이 10이고 n2가 3일 때 12 15 11 20 25 10 20 19 13 15
        // 12 15 11 -> 15 11 20 -> 11 20 25 ...
        // 첫번째 12 15 11 에서 15 11 20의 합을 구할려면
        // 12 15 11의 합에서 12를 빼고 20을 더하면 15 11 20 연속합을 구할 수 있다.
        // 즉 이전 합에서 첫번째 값을 뺴고 마지막 값을 더하면 된다.
        // 따라서 이중 포문을 돌리지 않아도 된다.
        int sum = 0;
        for(int i=0; i<n2; i++) sum += input1[i];

        int max = sum;

        for(int i=1; i<=n1-n2; i++) {
            sum = sum - input1[i-1] + input1[i+n2-1];
            if(sum > max) max = sum;
        }

        System.out.println(max);
    }
}
