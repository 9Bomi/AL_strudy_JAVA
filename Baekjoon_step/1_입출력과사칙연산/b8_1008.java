/*
백준 단계별로 풀어보기
1. 입출력과 사칙연산

1008. A/B

*/
import java.util.*;

public class b8_1008{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double a, b;

        a = sc.nextDouble();
        b = sc.nextDouble();

        System.out.println(a/b);
        sc.close();
    }
}