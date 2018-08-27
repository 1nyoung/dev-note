package strategy;

public class User {
	
	// 접근점
	private Remote remote;
	
	// 교환 가능
	public void setrRmote(Remote remote) {
		this.remote = remote;
	}
	
	public void on(){
		if(remote == null){
			System.out.println("에러");
		}else{
			remote.on();
		}

	}
	
	public void off(){
		if(remote == null){
			System.out.println("에러");
		}else{
			remote.off();
		}
	}
	
	
}
