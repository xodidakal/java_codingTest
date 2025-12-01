package section02;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t = in.nextInt();
        int answer = 0;

        // 내가 짠 코드
        // 자바 실행환경에서는 실행되나 문제풀이 프로그램에서는 Time Limit Exception 에러남
        // 오류 1 : 약수를 확인하는 범위 오류 -> 약수는 i보다 큰 값으로 나눌 필요 없다.
        // 오류 2 : count == 2 조건 오류 -> 현재 1~t-1까지의 범위인데 본인을 포함하지 않아 count가 2개 나오지 않는다.
        // 오류 3 : for 문을 두번 돌려서 입력값이 클 경우 시간 복잡도가 상당히 올라가 time limit 에러 발생
        // int count = 0;

        // for(int i = 1; i <= t; i++) {
        //     count = 0;
        //     for(int j=1; j <= t-1; j++){
        //         if( i%j == 0 ) count++;
        //     }
        //     if(count == 2) {
        //         result++;
        //     }
        // }

        // ********에라토스테네스 체 방식 (가장 빠르게 동작)

        // t+1을 하는 이유
        // 인덱스 숫자를 그대로 사용하기 위함인데
        // 만약 t=20일 때 그냥 t로 인덱스 범위를 설정하면 0~19까지만 생김
        // 20까지 생성해야 하기 때문에 t+1을 하는 것임
        int[] ch = new int[t+1];

        // 초기 배열
        //ch 2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20
        //   0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0

        //ch[i] == 0 이면 소수 -> answer++;
        //만약 ch[2] 는 소수이기에 2의 배수 인덱스는 0->1로 변경
        //다음 ch[3] 는 3이 소수이기 때문에 3의 배수를 0->1로 변경
        //반복
        for(int i=2; i<=t;  i++){
            if(ch[i] == 0) {
                answer++;
                for(int j=i; j<=t; j=j+i){ //i의 배수 체크
                    ch[j] = 1;
                }
            }

        }

        System.out.println(answer);

    }
}
