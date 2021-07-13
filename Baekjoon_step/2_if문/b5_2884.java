/*
백준 단계별로 풀어보기
1. 입출력과 사칙연산

2884. 알람시계

*/
import java.util.*;

public class b5_2884 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        if(m >=45){
            System.out.printf("%d %d\n",h,m-45);
        }
        else{
            if(h==0)
                h+=24;
            
            System.out.printf("%d %d\n",h-1,m+15);
        }
    }
}
