package Lv1;
/*
[문제 설명]
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

[제한 사항]
s는 길이가 1 이상, 100이하인 스트링입니다.
*/
public class Middle_character_import {
	
	public static String solution(String s) {
		String answer = "";
		String[] str = s.split("");
		
		if (str.length % 2 == 0) {
			answer = str[str.length / 2 - 1] + str[str.length / 2] ;
		} else {
			answer = str[str.length / 2];
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("abc"));
	}
	 
}
