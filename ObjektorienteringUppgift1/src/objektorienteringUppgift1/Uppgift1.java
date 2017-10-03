package objektorienteringUppgift1;


abstract class Uppgift1 implements IFood {
	Uppgift1(){}
	protected int vikt;
	protected String djurmat;
	protected String namn;
	
	public Uppgift1(int vikt, String djurmat, String namn) {
		this.vikt = vikt;
		this.djurmat = djurmat;
		this.namn = namn;
	}
	public String getName() {
		return namn;
	}
	public int getVikt() {
		return vikt;
	}
	public String getDjurmat() {
		return djurmat;
	}
}
