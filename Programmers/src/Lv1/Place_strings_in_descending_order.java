package Lv1;

import java.util.Arrays;
import java.util.Comparator;

/*
[문제 설명]
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

[제한 사항]
str은 길이 1 이상인 문자열입니다.
*/
public class Place_strings_in_descending_order {

	// 나의 풀이
	public static String solution(String s) {
		String[] answer = s.split("");

		Arrays.sort(answer, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				return o2.compareTo(o1);
			}

		});

		return String.join("", answer);
	}

	// 다른 사람의 풀이
	public String reverseStr(String str) {
		char[] sol = str.toCharArray();
		Arrays.sort(sol);
		return new StringBuilder(new String(sol)).reverse().toString();
	}

	public static void main(String[] args) {
		solution("Zbcdefg");
	}

}
