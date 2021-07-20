/*
백준 단계별로 풀어보기
7. 문자열 

1152. 단어의 개수
*/
import java.util.Scanner;
import java.util.StringTokenizer;

public class b6_1152 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        StringTokenizer st = new StringTokenizer(s," ");

        System.out.println(st.countTokens());
    }    
}