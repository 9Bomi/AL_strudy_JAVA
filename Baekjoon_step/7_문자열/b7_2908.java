import java.util.Scanner;

/*
백준 단계별로 풀어보기
7. 문자열 

2908. 상수
*/
public class b7_2908 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuffer a = new StringBuffer(sc.next());
        StringBuffer b = new StringBuffer(sc.next());

        int a_s = Integer.parseInt(a.reverse().toString());
        int b_s = Integer.parseInt(b.reverse().toString());

        if(a_s>b_s)
            System.out.println(a);
        else
            System.out.println(b);

        sc.close();
    }
}