package Lv1;

/*
[문제 설명]
길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 
d예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.

[제한 조건]
n은 길이 10,000이하인 자연수입니다.
*/
public class Watermelon {

	// 나의 풀이
	public static String solution(int n) {

		StringBuffer answer = new StringBuffer();

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) answer.append("수");
			else answer.append("박");
		
//			answer.append(i % 2 == 1 ? "수":"박");
		}
		
		return answer.toString();
	}
	
	// 새로운 풀이
	public static String solution2(int n) {

		StringBuffer answer = new StringBuffer();
		
		while(n>1) {
			answer.append("수박");
			n-=2;
		}
		if(n==1) answer.append("수");
		return answer.toString();
	}

	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution2(3));
	}

}
