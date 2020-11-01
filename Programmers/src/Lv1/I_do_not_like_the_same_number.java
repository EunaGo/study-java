package Lv1;

import java.util.*;

/*
[문제 설명]
배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 
이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 
단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,

arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

[제한 사항]
배열 arr의 크기 : 1,000,000 이하의 자연수
배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
*/

public class I_do_not_like_the_same_number {

	public static void main(String[] args) {

		int[] answer = { 1, 1, 3, 3, 3, 3, 3, 0, 1, 1 };
		solution(answer);
		
	}

	public static ArrayList<Integer> solution(int[] arr) {

		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);

		for (int i = 1; i < arr.length; i++) {
			for (int j = answer.size()-1; j < answer.size(); j++)
				if (arr[i] != answer.get(j)) {
					answer.add(arr[i]);
				}
		}

		System.out.println("answer size: " + answer.size() + "  answer :" + answer);
		return answer;
	}
	
	public static int[] solution2(int[]arr) { 
		
		int cnt =1;
		
		for (int j = 1; j < arr.length; j++) {
			if(arr[j-1]!=arr[j]) cnt++;
		}
		
		int[]answer = new int[cnt];
		int index=0;
		answer[0]=arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if(answer[index]!=arr[i]) {
				index++;
				answer[index]=arr[i];
			}
		}
		return answer;
	}
	
	public static ArrayList<Integer> solution3(int[] arr) {

		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i-1]) {
				answer.add(arr[i]);
			}
		}

		System.out.println("answer size: " + answer.size() + "  answer :" + answer);
		return answer;
	}

}
