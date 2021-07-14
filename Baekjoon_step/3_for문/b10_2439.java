/*
백준 단계별로 풀어보기
3. for문

2439. 별찍기 -2
*/
import java.io.*;

public class b10_2439 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());    //정수 입력 받을 때

        for(int i=1;i<=n;i++){
            for(int j=n-i;j>0;j--)
                bw.write(" ");
        
            for(int k=0;k<i;k++)
                bw.write("*");
            
            bw.write("\n");
        }

        bf.close();
	    bw.flush();
	    bw.close();
    }
}
