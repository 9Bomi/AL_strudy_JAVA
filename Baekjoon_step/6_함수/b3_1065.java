/*
백준 단계별로 풀어보기
6. 함수

1065. 한수
*/
import java.io.*;

public class b3_1065 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int sum =0;

        if(n==1000)
            n-=1;

        for(int i=1;i<=n;i++)
            if(i<100)
                sum++;
            else{
                int[] arr = new int[3];
                int num = i;

                for(int j=0;j<3;j++){
                    arr[j] = num%10;
                    num /=10; 
                }

                if(arr[0]-arr[1] == arr[1]-arr[2])
                    sum++;
            }
        
        bw.write(sum+"\n");
        bw.flush();
        
        bw.close();
        br.close();
    }
}
