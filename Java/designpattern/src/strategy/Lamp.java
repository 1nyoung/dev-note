package strategy;

public class Lamp implements Remote {

	@Override
	public void on() {
		System.out.println("������ �ѱ�");
		
	}

	@Override
	public void off() {
		System.out.println("������ ����");
		
	}

}
