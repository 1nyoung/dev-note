package singletone;

// 개발중에 시스템에서 스피커에 접근할 수 있는 클래스를 만들어주세요.
public class Main {

	public static void main(String[] args) {
		// 프라이빗이니까 에러
		//SystemSpeaker speaker = new SystemSpeaker();
		
		SystemSpeaker speaker1 = SystemSpeaker.getInstance();
		SystemSpeaker speaker2 = SystemSpeaker.getInstance();
		
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		speaker1.setVolume(11);
		speaker2.setVolume(12);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		// 같은 객체를 가리키고있음
		
		
	}

}
