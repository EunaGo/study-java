package Lv1;
/*
[문제 설명]
2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, 
solution을 완성하세요. 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT입니다. 
예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.

[제한 조건]
2016년은 윤년입니다.
2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
*/
public class Year2016 {

	// 나의 풀이
	public static String solution(int a, int b) {
		String answer = "";
		int cnt = 0;

		switch (a) {
		case 1:
			cnt = b;
			break;
		case 2:
			cnt = 31 + b;
			break;
		case 3:
			cnt = 31 + 29 + b;
			break;
		case 4:
			cnt = 31 + 29 + 31 + b;
			break;
		case 5:
			cnt = 31 + 29 + 31 + 30 + b;
			break;
		case 6:
			cnt = 31 + 29 + 31 + 30 + 31 + b;
			break;
		case 7:
			cnt = 31 + 29 + 31 + 30 + 31 + 30 + b;
			break;
		case 8:
			cnt = 31 + 29 + 31 + 30 + 31 + 30 + 31 + b;
			break;
		case 9:
			cnt = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + b;
			break;
		case 10:
			cnt = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + b;
			break;
		case 11:
			cnt = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + b;
			break;
		case 12:
			cnt = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + b;
			break;
		}

		switch (cnt % 7) {
		case 1:
			answer = "FRI";
			break;
		case 2:
			answer = "SAT";
			break;
		case 3:
			answer = "SUN";
			break;
		case 4:
			answer = "MON";
			break;
		case 5:
			answer = "TUE";
			break;
		case 6:
			answer = "WED";
			break;
		case 0:
			answer = "THU";
			break;
		}

		return answer;
	}
	
	// 다른 사람의 풀이
	public String solution2(int a, int b) {
	      String answer = "";

	      int[] c = {31,29,31,30,31,30,31,31,30,31,30,31};
	      String[] MM ={"FRI","SAT","SUN","MON","TUE","WED","THU"};
	      int Adate = 0;
	      for(int i = 0 ; i< a-1; i++){
	          Adate += c[i];
	      }
	      Adate += b-1;
	      answer = MM[Adate %7];

	      return answer;
	  }
	
	public static void main(String[] args) {
		System.out.println(solution(5, 24));
	}

}
