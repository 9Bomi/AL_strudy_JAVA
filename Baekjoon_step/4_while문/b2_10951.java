/*
백준 단계별로 풀어보기
4. while문

10951. A+B -4 
*/

import java.io.*;

public class b2_10951 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();
        int a ,b;

        while(s != null){
            String[] ans = s.split(" ");
            a = Integer.parseInt(ans[0]);
            b = Integer.parseInt(ans[1]);
            bw.write(a+b+"\n");
            s = br.readLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}