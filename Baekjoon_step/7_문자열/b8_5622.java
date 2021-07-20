/*
백준 단계별로 풀어보기
7. 문자열 

5622. 다이얼
*/

import java.util.*;

public class b8_5622 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int sum = 0;

        for(int i=0;i<s.length();i++){
            int num = s.charAt(i)-'A';

            if(num >= (int)('W'-'A'))
                sum +=10;
            else if(num >= (int)('T'-'A'))
                sum +=9;
            else if(num >= (int)('P'-'A'))
                sum +=8;
            else
                sum += Math.ceil((double)(num+1)/(double)3)+2;
           
        }

        System.out.println(sum);
        sc.close();
    }
}