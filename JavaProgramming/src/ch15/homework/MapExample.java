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
			String key = entry.getKey();
			int value = entry.getValue();
			totalScore =
					
		}

	}

}
