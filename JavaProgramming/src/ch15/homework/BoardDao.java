package ch15.homework;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	public List <Board> getBoardList(){  // ���� : getBoardList() �޼ҵ带 ȣ���ϸ� List<Board> Ÿ���� �÷����� �����ϵ��� �Ѵ�.
	List <Board> list  = new ArrayList<>(); 
		list.add(new Board("����1", "����1")); //Board(String title, String content) �������� �Ű����� 2���� String Ÿ��
		list.add(new Board("����2", "����2"));
		list.add(new Board("����3", "����3"));
		return list; //  List<Board>Ÿ���� ArrayList<>()�� list�� ���� 
	}
	

}
