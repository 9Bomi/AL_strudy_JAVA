/*
백준 단계별로 풀어보기
7. 문자열

1316. 그룹 단어 체커
*/

import java.io.*;

;public class b10_1316 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int num_group=0;

        for(int i=0;i<num;i++){
            String s = br.readLine();
            int[] arr = new int[26];

            boolean isGroup = true;
            char before = s.charAt(0);
            arr[before-'a']++;

            for(int j=1;j<s.length();j++){
                char now = s.charAt(j);

                if(before != now){
                    if(arr[now-'a'] != 0){
                        isGroup = false;
                        break;
                    }
                    else{
                        arr[now-'a']++;
                    }
                }
                
                before = now;
            }

            if(isGroup)
                num_group++;
        }

        bw.write(num_group+"\n");

        br.close();
        bw.flush();
        bw.close();
        
    }
}
