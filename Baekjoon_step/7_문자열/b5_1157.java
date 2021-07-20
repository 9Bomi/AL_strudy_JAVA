/*
백준 단계별로 풀어보기
7. 문자열 

1157. 단어 공부
*/
import java.util.*;

public class b5_1157 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toUpperCase();

        int[] arr = new int[26];
        int max =0;
        for(int i=0;i<s.length();i++){
            int num = s.charAt(i)-'A';
            arr[num]++;

            if(arr[num]>max)
                max = arr[num];
        }
        
        int count = 0;
        int ans=0;
        for(int i=0;i<26;i++)
            if(arr[i]==max){
                count++;
                ans = i;
            }
        
        if(count > 1)
            System.out.println("?");
        else
            System.out.println((char)('A'+ans));

        sc.close();
    }
}