/*
백준 단계별로 풀어보기
1. 입출력과 사칙연산

10869. 사칙연산

*/
import java.util.*;

public class b9_10869 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        sc.close();
    }
}
