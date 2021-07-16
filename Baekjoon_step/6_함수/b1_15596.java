/*
백준 단계별로 풀어보기
6. 함수

15596. 정수 N개의 합
*/
public class b1_15596 {

    public long sum(int[] a){
        long sum = 0;

        for(int n:a)
            sum +=n;

        return sum;
    }
}
