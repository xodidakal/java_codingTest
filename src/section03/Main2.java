package section03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n1 = in.nextInt();
        // 내가 짠 코드 -> Time Limit 에러 발생
        // int[] input1 = new int[n1];
        // List<Integer> answer = new ArrayList<>();

        // for(int i=0; i<n1; i++) {
        //     input1[i] = in.nextInt();
        // }

        // int n2 = in.nextInt();
        // int[] input2 = new int[n2];

        // for(int i=0; i<n2; i++) {
        //     input2[i] = in.nextInt();

        // }

        // for(int i=0; i<n1; i++) {
        //     for(int j=0; j<n2; j++) {
        //         if(input1[i] == input2[j]){
        //             if(!answer.contains(input1[i])){
        //                 answer.add(input1[i]);
        //             }
        //         }
        //     }
        // }
        // answer.sort(Comparator.naturalOrder());

        // for(int text : answer) {
        //     System.out.print(text+" ");
        // }

        // ****AI가 짠 코드 : n 이 3만개 이하이므로 이중 포문을 없애는게 중요!!
        // 두번째 배열을 입력할 때부터 이전 배열과 비교하여 값이 존재하는것만 담기
        // ArrayList 로 contains() 메소드를 사용할 경우 순차적으로 다 비교하기 때문에 3만개라면 3만건을 다 비교함
        // 따라서 HashSet 을 사용해야 해시를 이용해 바로 위치를 찾아가기 때문에 HashSet을 사용하는것이 유리
        // TreeSet을 이용하면 Sort() 메소드를 별도로 사용할 필요없이 자동으로 정렬해준다.
        Set<Integer> input1 = new HashSet<>();

        for(int i=0; i<n1; i++) input1.add(in.nextInt());

        int n2 = in.nextInt();
        // TreeSet : 배열 자동정렬
        Set<Integer> answer = new TreeSet<>();

        for(int j=0; j<n2; j++) {
            int num = in.nextInt();
            if(input1.contains(num)){
                answer.add(num);
            }
        }

        for(int text : answer) {
            System.out.print(text+" ");
        }
    }
}
