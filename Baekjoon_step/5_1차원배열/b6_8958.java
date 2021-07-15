/*
백준 단계별로 풀어보기
5. 1차원 배열

8958. OX퀴즈
*/
import java.io.*;

public class b6_8958 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            String s = br.readLine();

            int score = 0;
            int add = 0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j) == 'O')
                    score +=++add;
                else
                    add=0;
            }

            bw.write(score+"\n");
        }
        
        bw.flush();
        br.close();
        bw.close();
    }    
}
