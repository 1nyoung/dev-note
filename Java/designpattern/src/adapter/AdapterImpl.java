package adapter;

public class AdapterImpl implements Adapter{

	
	@Override
	public Float twice0f(Float f) {
		// 에러
		//return (Math.twoTime(f.doubleValue());
		//return (float) Math.twoTime(f.doubleValue());
		return Math.doubled(f.doubleValue()).floatValue();
	}

	@Override
	public Float half0f(Float f) {
		// Mate함수가 아닌 이곳에서 로그를 찍어야함
		System.out.println("half0f 시작");
		
		return (float) Math.half((f.doubleValue()));
	}

}
