/*
백준 단계별로 풀어보기
6. 함수

4673. 셀프 넘버
*/
import java.io.*;

public class b2_4673 {
    public static void main(String args[]) throws IOException{
        final int N = 10000;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] arr = new boolean[N+1];

        for(int i=1;i<=N;i++){
            int sum =i;
            int num =i;
            while(num>=1){
                sum += num%10;
                num /=10;
            }

            if(sum<=N)
                arr[sum] = true;
        }

        for(int i=1;i<=N;i++)
            if(arr[i] == false)
                bw.write(i+"\n");
        
        bw.flush();
        bw.close();
    }
}
