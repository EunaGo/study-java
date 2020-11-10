package Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
[문제 설명]
문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 
예를 들어 strings가 [sun, bed, car]이고 n이 1이면 각 단어의 인덱스 1의 문자 u, e, a로 strings를 정렬합니다.

[제한 조건]
strings는 길이 1 이상, 50이하인 배열입니다.
strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
모든 strings의 원소의 길이는 n보다 큽니다.
인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
*/
public class Sort_strings_as_I_like {

	// 나의 풀이
	public static List<String> solution(String[] strings, int n) {

		List<String> answer = new ArrayList<>();
		answer.add("sun");
		answer.add("bed");
		answer.add("car");
		
		for(String s : answer) {
			System.out.println(s);
		}
		
		Collections.sort(answer, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return compare(o1, o2);
			}
			
		});
		
		for(String s : answer) {
			System.out.println(s);
		}

		return answer;
	}

	public static void main(String[] args) {

		String[] strings = { "sun", "bed", "car" };
		int n = 1;

		solution(strings, n);
	}

}
