/*
백준 단계별로 풀어보기
5. 1차원 배열

4344. 평균은 넘겠지
*/
import java.io.*;
import java.util.StringTokenizer;

public class b7_4344 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final int N = 1000;
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            int num = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];
            double sum =0;
            for(int j=0;j<num;j++){
                int mem = Integer.parseInt(st.nextToken());
                arr[j] = mem;
                sum +=mem;
            }

            double avg = sum/num;
            double cnt =0;
            for(int m:arr){
                if(m>avg)
                    cnt++;
            }

            bw.write(String.format("%.3f",cnt/num*100)+"%\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
