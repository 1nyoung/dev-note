package strategy;

public class Door implements Remote {

	@Override
	public void on() {
		System.out.println("������ ����");
		
	}

	@Override
	public void off() {
		System.out.println("������ ��ױ�");
	}
}
