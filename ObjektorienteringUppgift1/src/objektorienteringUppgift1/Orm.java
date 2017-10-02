package objektorienteringUppgift1;

public class Orm extends Uppgift1 implements IFood, IPrintMe {
	protected int ormpellets;
	public Orm(int vikt, String djurmat, String namn) {
		super(vikt,djurmat,namn);
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
