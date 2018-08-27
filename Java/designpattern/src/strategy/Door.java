package strategy;

public class Door implements Remote {

	@Override
	public void on() {
		System.out.println("현관문 열기");
		
	}

	@Override
	public void off() {
		System.out.println("현관문 잠그기");
	}
}
