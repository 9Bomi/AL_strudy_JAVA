/*
백준 단계별로 풀어보기
2. if문

14681. 사분면 고르기

*/
import java.util.*;

public class b4_14681 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        
        if(x>0 && y>0){
            System.out.println(1);
        }
        else if (x<0 && y>0){
            System.out.println(2);
        }
        else if (x<0 && y<0){
            System.out.println(3);
        }
        else{
            System.out.println(4);
        }
    }
}
