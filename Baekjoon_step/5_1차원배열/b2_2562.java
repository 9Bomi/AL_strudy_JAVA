/*
백준 단계별로 풀어보기
5. 1차원 배열

2562. 최댓값
*/
import java.io.*;

public class b2_2562 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[9];
        int max =0;
        for(int i=0;i<9;i++){
            arr[i] = Integer.parseInt(br.readLine());
            
            if(arr[i]>max)
                max = arr[i];
        }
        bw.write(max+"\n");
        for(int i=0;i<9;i++)
            if(arr[i]==max)
                bw.write(i+1+"\n");
        
        bw.flush();
        bw.close();
        br.close();
    }    
}
