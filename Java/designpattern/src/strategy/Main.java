package strategy;

public class Main {
	public static void main(String[] args) {
		User userA = new User();
		userA.on();
		
		userA.setrRmote(new Door());
		userA.on();
		
		userA.setrRmote(new Lamp());
		userA.on();
		
		userA.setrRmote(new Tv());
		userA.on();
	}
	

	
	

}
