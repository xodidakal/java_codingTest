package section03;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        // 원래같으면 이중포문으로 O(n^2) 가 나오는 상황이다.
        // 하지만 입력되는 값이 10만, 1000천만이 입력될 수 있기 때문에
        // 포문을 최대한 한번만 돌게하여 O(n) 시간복잡도가 나오게 해야한다.
        Scanner in=new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int[] input1 = new int[n1];

        for(int i=0; i<n1; i++) input1[i] =in.nextInt();

        // 배열의 lt와 rt를 활용하여 합을 구하는 방법
        // rt 기준으로 반복문을 돌며 rt가 마지막 배열을 가리킬 때를 마지막으로 반복문을 돈다.
        // 그 사이 sum이 특정숫자와 같으면 count를 센다
        // 만약 다음숫자를 더한 sum이 특정숫자보다 작으면 rt만 더해 다음 숫자도 더한다.
        // 만약 다음숫자를 더한 sum이 특정숫자보다 크면 기존 sum에서 lt에 해당되는 값을 빼고 lt+1에 해당되는 값을 더한다.
        // sum이 작아질 때까지 이전 lt를 빼고 이후 lt를 더하는 작업을 반복해야한다.
        int sum = 0;
        int count = 0;
        int lt = 0; // lt부터

        for(int rt =0; rt<n1; rt++){
            sum += input1[rt];
            if(sum == n2) count++;
            while(sum >= n2){
                sum -= input1[lt++]; // lt++는 후위연산자이기 때문에 input1[it] 이후에 lt++가 계산된다.
                if(sum == n2) count++;
            }
        }

        System.out.println(count);

    }
}
