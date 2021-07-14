/*
백준 단계별로 풀어보기
3. for문

10871. X보다 작은 수
*/
import java.io.*;
import java.util.StringTokenizer;

public class b11_10871 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] s = br.readLine().split(" ");
        int x = Integer.parseInt(s[1]);

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();

        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            if(num < x){
                sb.append(num+" ");
            }

        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
        br.close();
    }
}
