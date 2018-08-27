package singletone;

// �����߿� �ý��ۿ��� ����Ŀ�� ������ �� �ִ� Ŭ������ ������ּ���.
public class Main {

	public static void main(String[] args) {
		// �����̺��̴ϱ� ����
		//SystemSpeaker speaker = new SystemSpeaker();
		
		SystemSpeaker speaker1 = SystemSpeaker.getInstance();
		SystemSpeaker speaker2 = SystemSpeaker.getInstance();
		
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		speaker1.setVolume(11);
		speaker2.setVolume(12);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		// ���� ��ü�� ����Ű������
		
		
	}

}
