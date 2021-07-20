/*
백준 단계별로 풀어보기
7. 문자열

2941. 크로아티아 알파벳
*/
import java.util.*;

public class b9_2941 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        int sum =0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '=' || c == '-')
                continue;
            if(c =='j' && i>0 && (s.charAt(i-1)=='l'|| s.charAt(i-1)=='n'))
                continue;
            if(c == 'z' && i>0 && i<s.length()-1 && s.charAt(i-1)=='d' && s.charAt(i+1)=='=')
                continue;

            sum++;
        }
        
        System.out.println(sum);
        
    }
}
