/*
백준 단계별로 풀어보기
7. 문자열 

2675. 문자열 반복
*/
import java.util.*;

public class b4_2675 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int count = sc.nextInt();
            String s = sc.next();

            StringBuilder sb = new StringBuilder();

            for(int j=0;j<s.length();j++)
                for(int k=0;k<count;k++)
                    sb.append(s.charAt(j));
            
            System.out.println(sb.toString());
        }

        sc.close();
    }    
}