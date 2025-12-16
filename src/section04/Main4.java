package section04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        // 슬라이드 윈도우 활용
        Scanner in=new Scanner(System.in);
        String S = in.next();
        String T = in.next();
        Map<Character, Integer> mapK = new HashMap<>();
        Map<Character, Integer> mapS = new HashMap<>();
        int answer = 0;

        for(Character c : T.toCharArray()) {
            mapK.merge(c, 1, Integer::sum);
        }

        char[] list = S.toCharArray();
        for(int i = 0; i < T.length(); i++) {
            mapS.merge(list[i], 1, Integer::sum);
        }
        if(mapK.equals(mapS)) answer++;

        for(int i = 1; i <= S.length() - T.length(); i++) {
            mapS.merge(list[i-1], -1, Integer::sum);
            if(mapS.get(list[i-1]) == 0) mapS.remove(list[i-1]);
            mapS.merge(list[i+T.length()-1], 1, Integer::sum);
            if(mapK.equals(mapS)) answer++;
        }

        System.out.println(answer);

    }
}
