package objektorienteringUppgift1;

abstract class Uppgift1 {
	Uppgift1(){}
	private int vikt;
	private String namn;
	private String namnInput;
	
	public void Uppgift1(int vikt, String namn) {
		this.vikt = vikt;
		this.namn = namn;
	}
	public String getNamn() {
		return namn;
	}
	public int getVikt() {
		return vikt;
	}
}
