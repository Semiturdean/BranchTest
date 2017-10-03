package objektorienteringUppgift1;

import javax.swing.JOptionPane;

public class Orm extends Uppgift1 implements IFood {
	protected int ormpellets;
	public Orm(int vikt, String djurmat, String namn) {
		super(vikt,djurmat,namn);
	}
	@Override
	public void Foder() {
		ormpellets = 20;
		JOptionPane.showMessageDialog(null, this.namn + " ska ha " + ormpellets + " gram " + this.djurmat);
	}
	
}
