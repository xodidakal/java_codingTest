package section06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>();
        String answer = "U";

        for(int i=0; i<n; i++) {
            int num = in.nextInt();
            if(list.stream().anyMatch(item -> item==num)) {
                answer = "D";
                break;
            }else {
                list.add(num);
            }
        }

        System.out.println(answer);

    }
}
