package section06;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        // LRU : Least Recently Used
        // 가장 최근에 사용되지 않은 것부터 제거
        // 중복되는 값이 있다면 해당 값 위치 뒷 값들만 한칸씩 땡긴다.
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = in.nextInt();
        int[] answer = new int[s];
        for(int i=0; i<s; i++) answer[i] = 0;

        for(int i = 0; i<n; i++) {
            int pos = -1;

            //이미 캐시메모리안에 삽입하려고 하는 값이 있다면
            for(int j=s-1; j>0; j--){
                if(arr[i] == answer[j]) {
                    // 해당위치를 담는다
                    pos = j;
                    break;
                }
            }

            // 중복된 메모리가 있다면
            if(pos != -1) {
                // 그 위치부터 앞으로 한칸씩 당긴다.
                for(int j=pos; j>0; j--) {
                    answer[j] = answer[j-1];
                }
            }else {
                // 없다면 전체를 앞으로 한칸씩 당긴다.
                for(int j=s-1; j>0; j--) {
                    answer[j] = answer[j-1];
                }
            }
            answer[0] = arr[i];
        }


        for(int i : answer) System.out.print(i + " ");
    }
}
