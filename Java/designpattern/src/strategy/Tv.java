package strategy;

public class Tv implements Remote{

	@Override
	public void on() {
		System.out.println("TV 켜기");
	}

	@Override
	public void off() {
		System.out.println("TV 끄기");
	}
	

	public void up() {
		System.out.println("채널 up");
	}


	public void down() {
		System.out.println("채널 down");
	}
	

}
