package objektorienteringUppgift1;

import javax.swing.JOptionPane;

public class Hund extends Uppgift1 {
	protected int hundfoder;
	public Hund(int vikt, String djurmat, String namn) {
		super(vikt,djurmat, namn);
	}
	@Override
	public void getName() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void printMe() {
		JOptionPane.showMessageDialog(null, hundfoder);
		
	}
	@Override
	public int foodcalculator() {
		hundfoder = getVikt() / 100;
		return hundfoder;
	}
	@Override
	public void getAnimal() {	
	}
}
