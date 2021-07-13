/*
백준 단계별로 풀어보기
2. if문

1330. 두 수 비교하기

*/
import java.util.*;

public class b1_1330 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

        if(a==b){
            System.out.println("==");
        }
        else if(a>b){
            System.out.println(">");
        }
        else{
            System.out.println("<");
        }
    }
}
