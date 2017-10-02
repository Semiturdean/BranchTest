package objektorienteringUppgift1;

import javax.swing.JOptionPane;

abstract class Uppgift1 implements IPrintMe, IFood {
	Uppgift1(){}
	private int vikt;
	private String djur;
	private String namn;
	
	public Uppgift1(int vikt, String djur) {
		this.vikt = vikt;
		this.djur = djur;
	}
	public void setNamn() {
		namn = JOptionPane.showInputDialog("Ange namn på djuret som skall matas!");
	}
	public String getNamn() {
		return namn;
	}
	public int getVikt() {
		return vikt;
	}
	public String getDjur() {
		return djur;
	}
}
