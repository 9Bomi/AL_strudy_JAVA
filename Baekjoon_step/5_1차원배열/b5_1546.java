/*
백준 단계별로 풀어보기
5. 1차원 배열

1546. 평균
*/
import java.io.*;
import java.util.*;

public class b5_1546 {
    public static void main (String args[]) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final int N = 1000;
        int[] arr = new int[N];

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int i=0;
        while(st.hasMoreTokens()){
            arr[i++] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr,0,n);

        double max = arr[n-1];
        double sum = 0;
        for(int j=0;j<n;j++)
            sum +=(((double)arr[j]/max)*100);
        
        bw.write(sum/n+"\n");
        bw.flush();
        br.close();
        bw.close();
    }    
}
