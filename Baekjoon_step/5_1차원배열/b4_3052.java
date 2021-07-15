/*
백준 단계별로 풀어보기
5. 1차원 배열

3052. 나머지
*/
import java.io.*;

public class b4_3052 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[42];

        for(int i=0;i<10;i++)
            arr[Integer.parseInt(br.readLine())%42]++;
        
        int ans=0;

        for(int n:arr)
            if(n>0)
                ans++;

        bw.write(ans+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
