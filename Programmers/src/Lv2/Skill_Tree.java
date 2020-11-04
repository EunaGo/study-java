package Lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*
[문제 설명]
선행 스킬이란 어떤 스킬을 배우기 전에 먼저 배워야 하는 스킬을 뜻합니다.

예를 들어 선행 스킬 순서가 스파크 → 라이트닝 볼트 → 썬더일때, 썬더를 배우려면 먼저 라이트닝 볼트를 배워야 하고, 
라이트닝 볼트를 배우려면 먼저 스파크를 배워야 합니다. 위 순서에 없는 다른 스킬(힐링 등)은 순서에 상관없이 배울 수 있습니다. 
따라서 스파크 → 힐링 → 라이트닝 볼트 → 썬더와 같은 스킬트리는 가능하지만, 썬더 → 스파크나 라이트닝 볼트 → 스파크 → 힐링 → 
썬더와 같은 스킬트리는 불가능합니다. 선행 스킬 순서 skill과 유저들이 만든 스킬트리1를 담은 배열 skill_trees가 매개변수로 주어질 때, 
가능한 스킬트리 개수를 return 하는 solution 함수를 작성해주세요.

[제한 조건]
스킬은 알파벳 대문자로 표기하며, 모든 문자열은 알파벳 대문자로만 이루어져 있습니다.
스킬 순서와 스킬트리는 문자열로 표기합니다.
예를 들어, C → B → D 라면 CBD로 표기합니다
선행 스킬 순서 skill의 길이는 1 이상 26 이하이며, 스킬은 중복해 주어지지 않습니다.
skill_trees는 길이 1 이상 20 이하인 배열입니다.
skill_trees의 원소는 스킬을 나타내는 문자열입니다.
skill_trees의 원소는 길이가 2 이상 26 이하인 문자열이며, 스킬이 중복해 주어지지 않습니다.
*/
public class Skill_Tree {

	// 나의 풀이 (2-3ms)
	public int solution(String skill, String[] trees) {
//      List<String>list2= Arrays.asList(tmp); //java.util.Arrays.ArrayList
		int answer = 0;
		for (int i = 0; i < trees.length; i++) {
			int cont = 0;
			int chk = 0;
			for (int j = 0; j < trees[i].length(); j++) {
				String s = String.valueOf(trees[i].charAt(j));
				int idx = skill.indexOf(s);
				if (idx == -1)
					chk++;
				if (cont == idx) {
					cont++;
				} else if (cont < idx) {
					cont = 0;
					break;
				}
			}

			if (cont > 0 || chk == trees[i].length())
				answer++;
		}
		return answer;
	}

	// 다른 사람의 풀이 (11ms)
	public int solution2(String skill, String[] skill_trees) {
		int answer = 0;
		ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
		// ArrayList<String> skillTrees = new ArrayList<String>();
		Iterator<String> it = skillTrees.iterator();

		while (it.hasNext()) {
			if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
				it.remove();
			}
		}
		answer = skillTrees.size();
		return answer;
	}

	// 다른 사람 풀이 - Iterator (실패) : remove시 size가 계속 변함
	public int solution3(String skill, String[] skill_trees) {
		int answer = 0;
		ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));

		for (int i = 0; i < skillTrees.size(); i++) {
			if (skill.indexOf(skillTrees.get(i).replaceAll("[^" + skill + "]", "")) != 0) {
				skillTrees.remove(i);
			}
		}
		answer = skillTrees.size();
		return answer;
	}

	// solution3을 보완한 코드
	public int solution4(String skill, String[] trees) {
		int answer = 0;

		ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(trees));
		for (int i = 0; i < skillTrees.size(); i++) {
			String s = skillTrees.get(i);
			if (skill.indexOf(s.replaceAll("[^" + skill + "]", "")) == 0) {
				answer++;
			}
		}

		return answer;
	}

	// 다른 사람의 풀이 - ArrayList, Iterator
	public int solution5(String skill, String[] trees) {
		int answer = 0;

		for (String s : trees) {
			if (skill.indexOf(s.replaceAll("[^" + skill + "]", "")) == 0)
				answer++;
		}

		return answer;
	}

	// ㅉ의 풀이 (0.6ms)
	public int solution6(String skill, String[] trees) {
		int answer = 0;
		StringBuffer sb = new StringBuffer();
		String[] arr;
		for (String s : trees) {
			arr = s.split("");
			sb.delete(0, sb.length());
			for (int j = 0; j < arr.length; j++) {
				if (skill.indexOf(arr[j]) != -1)
					sb.append(arr[j]);
			}
			int idx = skill.indexOf(sb.toString());
			if (idx == 0) {
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {

		Skill_Tree d = new Skill_Tree();
		String skill = "CBD";
		String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDA", "OPQ", "CED" };

		int result = d.solution3(skill, skill_trees);
		System.out.println(result);
	}
}
