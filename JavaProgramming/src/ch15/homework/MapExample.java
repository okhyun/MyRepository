package ch15.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		//Map �迭 �÷��� ����
		Map<String, Integer> map =  new HashMap<String, Integer>();
		
		//��Ʈ�� �߰�
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null; //�ְ� ������ ���� ���̵� ����
		int maxScore = 0; // �ְ� ���� ����
		int totalScore = 0; // ���� �հ� ����
		
		
		//�ۼ���ġ
		Set<Entry<String, Integer>> set = map.entrySet();
		for(Entry<String, Integer> entry : set) {
			String key = entry.getKey();
			int value = entry.getValue();
			totalScore =
					
		}

	}

}
