package objektorienteringUppgift1;

import javax.swing.JOptionPane;

abstract class Uppgift1 {
	Uppgift1(){}
	private int vikt;
	private String namn;
	
	public void setVikt(int vikt) {
		this.vikt = vikt;
	}
	public void setNamn() {
		namn = JOptionPane.showInputDialog("Vad heter djuret som skall matas?");
	}
	public String getNamn() {
		return namn;
	}
	public int getVikt() {
		return vikt;
	}
}
