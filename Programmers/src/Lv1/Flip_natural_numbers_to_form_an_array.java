package Lv1;
/*
[문제 설명]
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

[제한 조건]
n은 10,000,000,000이하인 자연수입니다.
*/
public class Flip_natural_numbers_to_form_an_array {
	
    public static int[] solution(long n) {
        int[] answer = new int[(int)Math.log10(n) + 1];
        String num = String.valueOf(n);
        String[] arr = num.split("");
        
        for(int i=0; i<arr.length; i++){
        	answer[i] = Integer.parseInt(arr[arr.length-i-1]);
        }
        System.out.println(answer.length);
        for(int j=0; j<answer.length; j++){
        	//System.out.println(answer[j]);
        }
        
        return answer;
    }

	public static void main(String[] args) {
		System.out.println(solution(12345));
	}

}
