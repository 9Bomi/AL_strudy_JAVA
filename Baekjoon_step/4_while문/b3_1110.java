/*
백준 단계별로 풀어보기
4. while문

1110. 더하기 사이클
*/
import java.io.*;

public class b3_1110 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        int initial_num = Integer.parseInt(n);
        int this_num ;
        int next_num = initial_num;
        int cycle = 0;

        do{
            cycle++;
            this_num = next_num;
            int num = this_num/10 + this_num%10;

            next_num = (this_num%10)*10 + num%10;
        }while(next_num != initial_num);

        bw.write(cycle+"\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
