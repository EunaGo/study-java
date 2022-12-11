package Lv1;

/*
[문제 설명]
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)

[제한 조건]
n은 2이상 1000000이하의 자연수입니다.

10 > 2,3,5,7
5 > 2,3,5
*/

public class Find_a_decimal_place {
	
	// timeout
	public static int solution(int n) {
		int answer = 0;
		
		for(int i=2; i<=n; i++) {
			boolean chk = true;
			for(int j=2; j<=i; j++) {
				if(i != j && i % j == 0) {
					chk = false;
				}
			}
			if(chk) answer++;
		}
		
		return answer;
	}
	
	// 에라토스테네스 체
	public static int solution2(int n) {
		int[] prime = new int[n + 1];
        int answer = 0;

        // 0, 1은 소수가 아님
        prime[0] = prime[1] = 0;

        // 2 ~ n 까지 배열에 담기
        for(int i = 2; i <=n; i++) prime[i] = i;

        for(int i = 2; i < n; i++){
        	// 배열의 값이 0이면 스킵
            if(prime[i] == 0) continue;
            // ex) n = 10, i = 2
            // j=4; j<=10; j+=2
            // 4, 6, 8, 10 까지 소수가 아님
            for(int j = 2 * i; j <=n; j += i) prime[j] = 0;
        }

        // 배열의 값이 0이 아니면 카운트
        for(int i = 0; i <prime.length; i++) if (prime[i] != 0) answer++;

		return answer;
	}
	
	// 다른 사람의 풀이
	public static int solution3(int n) {
		int answer = 0;
		
		// 2 ~ n까지 반복
		for(int i=2; i<=n; i++){
			// 2 ~ i까지 반복
			for(int j=2; j<=i; j++){
				if(j == i) ++answer;
				else if(i % j == 0) break;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution3(10));
	}

}
