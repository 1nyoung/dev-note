package adapter;

public class AdapterImpl implements Adapter{

	
	@Override
	public Float twice0f(Float f) {
		// ����
		//return (Math.twoTime(f.doubleValue());
		//return (float) Math.twoTime(f.doubleValue());
		return Math.doubled(f.doubleValue()).floatValue();
	}

	@Override
	public Float half0f(Float f) {
		// Mate�Լ��� �ƴ� �̰����� �α׸� ������
		System.out.println("half0f ����");
		
		return (float) Math.half((f.doubleValue()));
	}

}
