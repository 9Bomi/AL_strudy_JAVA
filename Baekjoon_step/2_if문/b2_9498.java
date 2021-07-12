/*
백준 단계별로 풀어보기
1. 입출력과 사칙연산

9498. 시험 성적

*/
import java.util.*;

public class b2_9498 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        sc.close();

        if(score>=90){
            System.out.println("A");
        }
        else if(score>=80){
            System.out.println("B");
        }
        else if(score>=70){
            System.out.println("C");
        }
        else if(score>=60){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
}
