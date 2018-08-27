package adapter;

public class Main {

	public static void main(String[] args) {

		
		Adapter adapter = new AdapterImpl();
		
		System.out.println(adapter.twice0f(100f));
		System.out.println(adapter.half0f(80f));
	}

}
