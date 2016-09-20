package ch15.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		//Map 계열 컬렉션 생성
		Map<String, Integer> map =  new HashMap<String, Integer>();
		
		//엔트리 추가
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null; //최고 점수를 받은 아이디 저장
		int maxScore = 0; // 최고 점수 저장
		int totalScore = 0; // 점수 합계 저장
		
		
		//작성위치
		Set<Entry<String, Integer>> set = map.entrySet();
		for(Entry<String, Integer> entry : set) {
			 if(entry.getValue()>maxScore) {
				 name = entry.getKey();
				 maxScore = entry.getValue();
			 }
			 	totalScore += entry.getValue();
		}

		int avgScore = totalScore / map.size();
		System.out.println("평균점수: " + avgScore);

		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);

	}

}
