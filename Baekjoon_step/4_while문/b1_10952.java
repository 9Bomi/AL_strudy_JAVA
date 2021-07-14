/*
백준 단계별로 풀어보기
4. while문

10952. A+B -5 
*/
import java.io.*;

public class b1_10952 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();
        String[] ans = s.split(" ");
        int a = Integer.parseInt(ans[0]);
        int b = Integer.parseInt(ans[1]);

        while(a!=0 && b!=0){
            bw.write(a+b+"\n");

            s = br.readLine();
            ans = s.split(" ");
            a = Integer.parseInt(ans[0]);
            b = Integer.parseInt(ans[1]);
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
