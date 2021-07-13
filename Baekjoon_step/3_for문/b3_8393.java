/*
백준 단계별로 풀어보기
3. for문

8393. 합
*/
import java.util.*;

public class b3_8393 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int sum =0;
        for(int i=1;i<=n;i++){
            sum +=i;
        }
        System.out.println(sum);
    }
}
