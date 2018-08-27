package singletone;

public class SystemSpeaker {
	static private SystemSpeaker instance;
	private int volume;
	
	// �����̺�
	private SystemSpeaker(){
		volume = 5;
	}
	
	// ����ƽ
	public static SystemSpeaker getInstance(){
		if(instance == null){
			// ������ ����Ŀ�� ����Ҽ��ִ� �۾�
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
