package objektorienteringUppgift1;

import javax.swing.JOptionPane;

public class Katt extends Uppgift1 implements IFood {
	protected double kattfoder;
	public Katt(int vikt, String djurmat, String namn) {
		super(vikt,djurmat, namn);
	}
	
	@Override
	public void Foder() {
	kattfoder = this.vikt / 150; 
	JOptionPane.showMessageDialog(null, this.namn + " ska ha " + kattfoder + " gram " +  this.djurmat);
		
	}
}
