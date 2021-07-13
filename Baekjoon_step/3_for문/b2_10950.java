/*
백준 단계별로 풀어보기
3. for문

10950. A+B -3 
*/
import java.util.*;

public class b2_10950{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }

        sc.close();
    }
}