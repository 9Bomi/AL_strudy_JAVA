/*
백준 단계별로 풀어보기
5. 1차원 배열

2577. 숫자의 개수
*/
import java.io.*;

public class b3_2577 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int num = a*b*c;

        String s = String.valueOf(num);

        int[] arr = new int[10];

        for(int i=0;i< s.length();i++){
            int n = s.charAt(i)-'0';
            arr[n]++;
        }

        for(int i:arr)
            bw.write(i+"\n");

        bw.flush();
        bw.close();
        br.close();
    }    
}
