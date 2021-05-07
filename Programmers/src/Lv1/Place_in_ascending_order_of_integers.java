package Lv1;

import java.util.Arrays;

/*
[문제 설명]
함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
예를들어 n이 118372면 873211을 리턴하면 됩니다.

[제한 조건]
n은 1이상 8000000000 이하인 자연수입니다.
*/
public class Place_in_ascending_order_of_integers {
	
    public static long solution(long n) {
        String str = "";
        int nSize = (int)Math.log10(n)+1;
        long arr[] = new long[nSize];
        
        str = n+"";
        char[] num = str.toCharArray();
        Arrays.sort(num);
        str = "";
        
        for(int i=0; i<arr.length; i++) str += num[arr.length-i-1]+"";
        
        return Long.parseLong(str);
    }

	public static void main(String[] args) {
		System.out.println(solution(2345433));
	}

}
