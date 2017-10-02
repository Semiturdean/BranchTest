package objektorienteringUppgift1;

import javax.swing.JOptionPane;

abstract class Uppgift1 implements IPrintMe, IFood {
	Uppgift1(){}
	private int vikt;
	private String djurmat;
	private String namn;
	
	public Uppgift1(int vikt, String djurmat, String namn) {
		this.vikt = vikt;
		this.djurmat = djurmat;
		this.namn = namn;
	}
	private Hund Sixten = new Hund (5 , "Hundfoder", "Sixten");
	private Hund Dogge = new Hund(10,"Hundfoder", "Dogge");
	private Katt Venus = new Katt(5, "Kattfoder", "Venus");
	private Katt Ove = new Katt(3, "Kattfoder", "Ove");
	private Orm Hypno = new Orm(1, "Ormpellets", "Hypno");
	
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
		return djurmat;
	}
}
