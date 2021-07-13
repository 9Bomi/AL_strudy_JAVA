/*
백준 단계별로 풀어보기
3. for문

2739. 구구단
*/
import java.util.*;

public class b1_2739 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i=1;i<=9;i++)
            System.out.printf("%d * %d = %d\n",n,i,n*i);
        
    }
}
