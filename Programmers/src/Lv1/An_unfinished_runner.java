package Lv1;

import java.util.ArrayList;
import java.util.HashSet;

/*
[문제 설명]
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

[제한 사항]
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.
*/
public class An_unfinished_runner {
	
    public static String solution(String[] participant, String[] completion) {
        ArrayList<String> list = new ArrayList<>();
        String answer = "";
        
        for(int i=0; i<completion.length; i++){
        	list.add(completion[i]);
        }
        
        for(int j=0; j<participant.length; j++){
        	if(!list.contains(participant[j])){
        		answer = participant[j];
        	}else{
        		list.remove(participant[j]);
        	}
        }
        
        return answer;
    }
    
    public static String solution2(String[] participant, String[] completion) {
        String answer = "";
        int chk = 0;
        
        if(completion.length > 0){
	        for(int i=0; i<participant.length; i++){
	        	for(int j=0; j<completion.length; j++){
	        		if(!participant[i].equals(completion[j])) chk = 1;
	        		else{
	        			chk = 0;
	        			completion[j] = "";
	        			break;
	        		}
	        	}
	        	if(chk == 1){
	        		answer = participant[i];
	        		break;
	        	}
	        }
        }else answer = participant[0];
        
        return answer;
    }
    
    public static String solution3(String[] participant, String[] completion) {
        HashSet<String> map = new HashSet<>();
        String answer = "";
        
        if(completion.length <= 0) return participant[0];
        
        for(int i=0; i<completion.length; i++){
        	map.add(completion[i]);
        }
        
        for(int j=0; j<completion.length; j++){
        	if(!map.contains(participant[j])){
        		answer = participant[j];
        		break;
        	}else{
        		map.remove(participant[j]);
        	}
        }
        
        if(answer.equals("")) answer = participant[participant.length-1];
        
        return answer;
    }

	public static void main(String[] args) {
		//String[] participant = {"mislav", "stanko", "ana", "mislav"};
		//String[] completion = {"stanko", "ana", "mislav"};
		//String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		//String[] completion = {"josipa", "filipa", "marina", "nikola"};
		String[] participant = {"leo","s","leo","s"};
		String[] completion = {"s","leo","s"};
		System.out.println(solution3(participant, completion));
	}

}
