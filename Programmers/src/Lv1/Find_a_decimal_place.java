package Lv1;

import java.util.ArrayList;

/*
[문제 설명]
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)

[제한 조건]
n은 2이상 1000000이하의 자연수입니다.
*/

public class Find_a_decimal_place {
	
	public static int solution(int n) {
		int answer = 0;

		for(int i=2; i<=n; i++) {
			for(int j=2; j<=i; j++) {
				if(i%j==0 && i>j) break;
				else if(i%j==0 && i==j) answer++;
			}
		}
		return answer;
	}

	// 에라토스테네스 체
	public static int solution2(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int answer = 0;
		
		for(int i=2; i<=n; i++) list.add(n);
		
		for(int j=2; j<=Math.sqrt(n); j++) {
			if(j%n == 0) {
				for(int k=2; k<=n; k++) {
					list.remove(n);
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(10));
	}

}
