package Lv1;
/*
[문제 설명]
두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 
배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 
예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

[제한 조건]
두 수는 1이상 1000000이하의 자연수입니다.

++유클리드 호제법++
85, 51의 최대공약수를 구해보자
85 % 51 = 34, 51 % 34 = 17, 34 % 17 = 0 이다.
이때 17이 최대 공약수가 된다.
*/
public class Maximum_pledge_and_minimum_common_multiple {
	
    public static int[] solution(int n, int m) {
        int[] answer = {1, 1};
        boolean flag = true;
        int min = 0;
        
        if(n > m) min = m;
        else min = n;
        
        int i = 2;
        while(flag != false){
        	if(min > 1){
		        while(i <= min){
		        	if(n%i==0 && m%i==0){
		        		answer[0] *= i;
		        		answer[1] *= i;
		        		n = n/i;
		        		m = m/i;
		    			flag = true;
		        		i++;
		        		break;
		        	} else{
		        		if(i == min){
		        			flag = false;
		        			answer[1] *= (n*m);
		        		}
		        		i++;
		        	}
		        }
		        i = 2;
        	}
        }
        
        return answer;
    }
    
    // 유클레드 호제법 & ㅉ의 첨삭
    public static int[] solution2(int n, int m){
    	int[] answer = new int[2];
    	answer[1] = n*m;
    	int val = 1;
    	
    	while(val!=0){
    		val = n % m;
    		answer[0] = m;
    		n = m;
    		m = val;
    	}
    	answer[1] /= answer[0];
    	
    	return answer;
    }

	public static void main(String[] args) {
		//solution(1232, 31244);
		//solution(3, 12);
		solution2(85, 51);
		
	}
	

}
