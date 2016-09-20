package ch15.exam07;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> queue = new LinkedList<>();
		
		queue.offer(new Message("sendMail", "홍길동")); //메시지 저장
		queue.offer(new Message("sendSMS", "감자바"));
		queue.offer(new Message("sendKakaotalk", "홍두깨"));
		
		while(!queue.isEmpty()) { //메시지가 비어 있는지 확인
			Message message = queue.poll(); //메시지 큐에서 한개의 메시지 꺼냄
			switch(message.command) {
				case "sendMail":
					System.out.println(message.to + "님에게 메일을 보냅니다");
					break;
				case "sendSMS":
					System.out.println(message.to + "님에게 SNS를 보냅니다");
					break;
				case "sendKakaotalk":
					System.out.println(message.to + "님에게 카카오톡을 보냅니다");
					break;
			}
		}

	}

}
