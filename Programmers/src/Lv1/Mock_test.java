package Lv1;

import java.util.ArrayList;
import java.util.Collections;

public class Mock_test {
	
    public static ArrayList<Integer> solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<Integer>(); 
        
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        
        for(int i=0; i<answers.length; i++) {
        	if(answers[i] == one[i%5]) 
        		cnt1++;
        	if(answers[i] == two[i%8]) 
        		cnt2++;
        	if(answers[i] == three[i%10]) 
        		cnt3++;
        }
        
        int max = Math.max(cnt1, Math.max(cnt2, cnt3));
        if(max==cnt1) answer.add(1);
        if(max==cnt2) answer.add(2);
        if(max==cnt3) answer.add(3);
        
        return answer;
    }
    
    public static ArrayList<Integer> solution2(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<Integer>(); 
        
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        
        for(int i=0; i<answers.length; i++) {
        	
        	if(answers[i] == one[i%5]) {
        		cnt1++;
        	}
        	if(answers[i] == two[i%8]) {
        		cnt2++;
        	}
        	if(answers[i] == three[i%10]) {
        		cnt3++;
        	}
        	
        }
        
        answer.add(1);
        if(answer.get(0)<cnt2) {
        	answer.set(0,2);
        }else if(answer.get(0) == cnt2) {
        	answer.add(2);
        }
        if(answer.get(0)<cnt3) {
        	answer.set(0,3);
        	if(answer.size()==2) {
        		answer.remove(1);
        	}
        } else if(answer.get(0) == cnt3) {
        	answer.add(3);
        }
        
        Collections.sort(answer);
        
        return answer;
    }

	public static void main(String[] args) {
		int[] answer = {1,2,3,4,5};
		solution(answer);
	}

}
