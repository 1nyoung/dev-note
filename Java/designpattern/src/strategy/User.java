package strategy;

public class User {
	
	// ������
	private Remote remote;
	
	// ��ȯ ����
	public void setrRmote(Remote remote) {
		this.remote = remote;
	}
	
	public void on(){
		if(remote == null){
			System.out.println("����");
		}else{
			remote.on();
		}

	}
	
	public void off(){
		if(remote == null){
			System.out.println("����");
		}else{
			remote.off();
		}
	}
	
	
}
