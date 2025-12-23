package section06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        // 이분검색(=이진검색)
        // 타겟하는 값이 나올때까지 반씩 나누어 해당 값이 타겟값과 동일하는지 확인
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        int answer = 0;

        for(int i=0; i<n; i++) arr[i] = in.nextInt();

        Arrays.sort(arr);

        // 내림차순으로 하고싶다면
        // 기본 int는 내림차순이 안되고 Integer로 배열을 변경해서 내림차순을 하면 된다.
        // Integer[] arr = {3, 1, 4, 1, 5};
        // Arrays.sort(arr, Collections.reverseOrder());  // 내림차순

        //반복문 방법
        int start = 0;
        int end = n-1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;

            if(arr[mid] == m) {
                answer = mid+1; break;
            }
            else if(arr[mid] > m) {end = mid -1;}
            else start = mid+1;
        }

        System.out.println(answer);
    }

    //재귀함수 방법
    public int sortNum(int[] list, int target, int start, int end) {
        if(start > end) return 0;
        int mid = (start + end) / 2;

        if(list[mid] == target) return mid;
        else if(list[mid] > target){
            // mid-1을 하는 이유
            // mid는 이미 타겟과 같지 않다는것을 비교했으므로 다시 검사하지 않기 위함
            return sortNum(list, target, start, mid - 1);
        }else{
            // mid+1을 하는 이유
            // mid는 이미 타겟과 같지 않다는것을 비교했으므로 다시 검사하지 않기 위함
            return sortNum(list, target, mid + 1, end);
        }


    }
}
