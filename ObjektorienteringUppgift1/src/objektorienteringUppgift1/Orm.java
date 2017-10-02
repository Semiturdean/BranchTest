package objektorienteringUppgift1;

public class Orm extends Uppgift1 implements IFood, IPrintMe {
	protected int ormpellets;
	public Orm(int vikt, String djur, int ormpellets) {
		super(vikt,djur);
	}
	@Override
	public int foodcalculator() {
		ormpellets = 20;
		return ormpellets;
	}

	@Override
	public void getAnimal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printMe() {
		// TODO Auto-generated method stub
		
	}

}
