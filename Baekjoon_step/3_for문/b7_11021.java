/*
백준 단계별로 풀어보기
3. for문

11021. A+B -7
*/
import java.io.*;
import java.util.StringTokenizer;

public class b7_11021 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());    //정수 입력 받을 때

        for(int i=1;i<=n;i++){
            StringTokenizer st = new StringTokenizer(bf.readLine()," ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            int sum = a+b;
            bw.write("Case #"+i+": "+sum+"\n");
        }

        bf.close();
	    bw.flush();
	    bw.close();
    }
}