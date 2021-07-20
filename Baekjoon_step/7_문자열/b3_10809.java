/*
백준 단계별로 풀어보기
7. 문자열 

10809. 알파벳 찾기
*/
import java.util.*;

public class b3_10809 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int[] alpha = new int[26];
        Arrays.fill(alpha,-1);

        for(int i=0;i<s.length();i++){
           int num = s.charAt(i)-'a';

           if(alpha[num]==-1)
                alpha[num] =i;
        }

        for(int j:alpha)
            System.out.print(j+" ");

    }
    
}