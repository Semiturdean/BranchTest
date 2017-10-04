package objektorienteringUppgift1;

import javax.swing.JOptionPane;

public class Hund extends Uppgift1 implements IFood {
	protected double hundfoder;
	public Hund(int vikt, String djurmat, String namn) {
		super(vikt,djurmat,namn);
	}
	
	public void Foder() {
		hundfoder = this.vikt / 100;
		JOptionPane.showMessageDialog(null, this.namn + " ska ha " + hundfoder +  " gram " + this.djurmat);
	}
}
