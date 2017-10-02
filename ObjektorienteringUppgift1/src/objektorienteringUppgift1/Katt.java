package objektorienteringUppgift1;

public class Katt extends Uppgift1 implements IFood, IPrintMe {
	protected int kattfoder;
	public Katt(int vikt, String djur, int kattfoder) {
		super(vikt,djur);
	}
	@Override
	public void getName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printMe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int foodcalculator() {
		kattfoder = getVikt() / 100;
		return kattfoder;
	}

	@Override
	public void getAnimal() {
		// TODO Auto-generated method stub
		
	}

}
