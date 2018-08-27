package singletone;

public class SystemSpeaker {
	static private SystemSpeaker instance;
	private int volume;
	
	// 프라이빗
	private SystemSpeaker(){
		volume = 5;
	}
	
	// 스태틱
	public static SystemSpeaker getInstance(){
		if(instance == null){
			// 원래는 스피커와 통신할수있는 작업
			instance = new SystemSpeaker();
		}
		return instance;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
}
