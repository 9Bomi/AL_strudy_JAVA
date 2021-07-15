/*
백준 단계별로 풀어보기
5. 1차원 배열

10818. 최소, 최대
*/
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b1_10818 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();
        final int N = 1000000;

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int index =0;
        while(st.hasMoreTokens()){
            arr[index++] =  Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr,0,index);

        bw.write(arr[0]+" "+arr[index-1]+"\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
