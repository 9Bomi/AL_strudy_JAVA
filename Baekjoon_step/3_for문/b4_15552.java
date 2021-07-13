/*
백준 단계별로 풀어보기
3. for문

15552. 빠른 A+B
*/
import java.io.*;
import java.util.StringTokenizer;

public class b4_15552 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());    //정수 입력 받을 때

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(bf.readLine()," ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write(a+b+"\n");
        }

        bf.close();
	    bw.flush();
	    bw.close();
    }
}
