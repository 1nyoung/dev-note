package strategy;

public class Tv implements Remote{

	@Override
	public void on() {
		System.out.println("TV �ѱ�");
	}

	@Override
	public void off() {
		System.out.println("TV ����");
	}
	

	public void up() {
		System.out.println("ä�� up");
	}


	public void down() {
		System.out.println("ä�� down");
	}
	

}
