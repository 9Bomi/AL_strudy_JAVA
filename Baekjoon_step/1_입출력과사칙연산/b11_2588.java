/*
백준 단계별로 풀어보기
1. 입출력과 사칙연산

2588. 곱셈

*/
import java.util.*;

public class b11_2588 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a,b;

        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        int bb=b;
        while(bb>=1){
            int num = bb%10;
            System.out.println(a*num);
            bb /=10;
        }
        System.out.println(a*b);
    }
}
