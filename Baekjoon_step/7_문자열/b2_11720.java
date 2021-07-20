/*
백준 단계별로 풀어보기
7. 문자열 

11720. 숫자의 합
*/
import java.util.*;

public class b2_11720 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String num = sc.next();
        sc.close();

        int sum =0;
        for(int i=0;i<n;i++)
            sum +=num.charAt(i)-'0';

        System.out.println(sum);
    }
}