package strategy;

public class Lamp implements Remote {

	@Override
	public void on() {
		System.out.println("Çü±¤µî ÄÑ±â");
		
	}

	@Override
	public void off() {
		System.out.println("Çü±¤µî ²ô±â");
		
	}

}
