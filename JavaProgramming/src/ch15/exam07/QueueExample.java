package ch15.exam07;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> queue = new LinkedList<>();
		
		queue.offer(new Message("sendMail", "ȫ�浿")); //�޽��� ����
		queue.offer(new Message("sendSMS", "���ڹ�"));
		queue.offer(new Message("sendKakaotalk", "ȫ�α�"));
		
		while(!queue.isEmpty()) { //�޽����� ��� �ִ��� Ȯ��
			Message message = queue.poll(); //�޽��� ť���� �Ѱ��� �޽��� ����
			switch(message.command) {
				case "sendMail":
					System.out.println(message.to + "�Կ��� ������ �����ϴ�");
					break;
				case "sendSMS":
					System.out.println(message.to + "�Կ��� SNS�� �����ϴ�");
					break;
				case "sendKakaotalk":
					System.out.println(message.to + "�Կ��� īī������ �����ϴ�");
					break;
			}
		}

	}

}
