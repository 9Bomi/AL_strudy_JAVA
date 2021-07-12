/*
백준 단계별로 풀어보기
1. 입출력과 사칙연산

2753. 윤년

*/
import java.util.*;

public class b3_2753 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();

        if(year%400 == 0 || (year%4 ==0 && year%100 !=0)){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
