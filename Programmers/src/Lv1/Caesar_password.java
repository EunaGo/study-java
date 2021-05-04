package Lv1;
/*
[문제 설명]
어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 
예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 
문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

[제한 조건]
공백은 아무리 밀어도 공백입니다.
s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
s의 길이는 8000이하입니다.
n은 1 이상, 25이하인 자연수입니다.
*/
public class Caesar_password {
	
	// A~Z : 65~90
	// a~z : 97~122
	
	public static String solution(String s, int n){
		String answer = "";
		char c;
		int cInt;
		
		for(int i=0; i<s.length(); i++){
			c = s.charAt(i);
			cInt = (int)c;
			if(cInt != ' '){
				if(cInt >=65 && cInt<=90){
					c = (char)(cInt + n);
					cInt = (int)c;
					if(cInt > 90){
						cInt = cInt - 90 + 64;
						c = (char)cInt;
					}
				}
				if(cInt >=97 && cInt<=122){
					c = (char)(cInt + n);
					cInt = (int)c;
					if(cInt > 122){
						cInt = cInt - 122 + 96;
						c = (char)cInt;
					}
				}
			}
			answer += c;
		}
		
		return answer;
	}
	
	// 다른 사람의 풀이
	public static String solution2(String s, int n){
		String result = "";
		n = n % 26;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isLowerCase(ch)) {
				ch = (char) ((ch - 'a' + n) % 26 + 'a');
			} else if (Character.isUpperCase(ch)) {
				ch = (char) ((ch - 'A' + n) % 26 + 'A');
			}
			result += ch;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(solution2("z",1));
	}

}
