/*
백준 단계별로 풀어보기
3. for문

2742. 기찍 N
*/
import java.io.*;

public class b6_2742 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());    //정수 입력 받을 때

        for(int i=n;i>=1;i--){

            bw.write(i+"\n");
        }

        bf.close();
	    bw.flush();
	    bw.close();
    }
}