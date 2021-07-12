/*
백준 단계별로 풀어보기
1. 입출력과 사칙연산

10430. 나머지

*/

import java.util.*;

public class b10_10430 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int A, B, C;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C))%C);

        sc.close();
    }
    
}
