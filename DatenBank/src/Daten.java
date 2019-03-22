
public class Daten {

	private String sel1;
	private String sel2;
	private String sel3;

	private String ins1;
	private String ins2;

	private String del1;
	private String del2;
	
	
	public String getDel1() {
		return del1;
	}

	public String getDel2() {
		return del2;
	}

	public void setDel1(String del1) {
		this.del1 = del1;
	}

	public void setDel2(String del2) {
		this.del2 = del2;
	}
	
	public String getDel() {
		return "delete from " +del1+ " where "+del2;
	}

	public String getSel1() {
		return sel1;
	}

	public String getSel2() {
		return sel2;
	}

	public String getSel3() {
		return sel3;
	}

	public String getSel() {
		return "select " +sel1+" from "+sel2+" where "+sel3;
	}

	public String getIns1() {
		return ins1;
	}

	public String getIns2() {
		return ins2;
	}

	public String getIns() {
		return "insert into "+ ins1 +" values("+ ins2 +");";
	}

	
	public void setSel1(String sel1) {
		this.sel1 = sel1;
	}

	public void setSel2(String sel2) {
		this.sel2 = sel2;
	}

	public void setSel3(String sel3) {
		this.sel3 = sel3;
	}

	public void setIns1(String ins1) {
		this.ins1 = ins1;
	}

	public void setIns2(String ins2) {
		this.ins2 = ins2;
	}



}
