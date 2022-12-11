package Lv1;

/*
[문제 설명]
주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 
숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.

[제한 조건]
nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.

11 > 1, 6, 4
11 > 1, 3, 7
*/

public class making_decimals {
	
	public static int solution(int[] nums) {
        int answer = 0;
        int[] arr = new int[3];
        
        // 첫번째 수
        for(int i=0; i<nums.length; i++) {
        	arr[0] = nums[i];
        	
        	// 두번째 수
        	for(int j=i+1; j<nums.length; j++) {
        		if(nums[j] != arr[0]) {
        			arr[1] = nums[j];
            		
            		// 세번째 수
                	for(int k=j+1; k<nums.length; k++) {
                		if(nums[k] != arr[1] && nums[k] != arr[0]) {
                			arr[2] = nums[k];
                			
                			// 소수 구하기
                			int sum = arr[0] + arr[1] + arr[2];
                			for(int z=2; z<=sum; z++) {
                				if(z == sum) ++answer;
                				else if(sum % z == 0) break;
                			}
                		}
                	}
        		}
        	}
        }

        return answer;
    }
	
	// 다른 사람의 풀이
	public static int solution2(int[] nums) {
      int answer = 0;
      boolean chk = false;

      for (int i = 0; i < nums.length; i++) {
         for (int j = i + 1; j < nums.length; j++) {
            for (int k = j + 1; k < nums.length; k++) {
               int num = nums[i] + nums[j] + nums[k]; //값을 담아
               if (num >= 2) //경우의 수를 찾아서
                  chk = sosu(num);
               if (chk == true) //소수가 맞을 경우
                  answer++; 

            }
         }

      }
      return answer;
   }
   
   public static boolean sosu(int num) {
      boolean check = true; 
      if(num==2) { //소수일때
         return check;
         
      }
      for(int i=2; i<num; i++) { //소수가 아닐때
         if(num%i ==0) {
            check = false;
            break;
         }
      }
      return check;
   }

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println(solution(arr));
		System.out.println(solution2(arr));
	}

}
