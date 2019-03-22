import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Rechner {
	private int zahl1 = 0;
	private int zahl2 = 0;
	private int rechnen;
	private String wert = "+";
	
	public int getZahl1() {
		return zahl1;
	}

	public void setZahl1(int zahl1) {
		this.zahl1 = zahl1;
	}

	public int getZahl2() {
		return zahl2;
	}

	public void setZahl2(int zahl2) {
		this.zahl2 = zahl2;
	}

	public int getRechnen() {
		if(wert.equals("-")) {
			return zahl1 - zahl2;
		}
		else if(wert.equals("*")) {
			return zahl1 * zahl2;
		}
		else if(wert.equals("/") && zahl2 != 0) {
			return zahl1 / zahl2;
		}else if(wert.equals("+")){
			return zahl1 + zahl2;
		}else {
			return 0;
		}
		
	}

	public String getWert() {
		return wert;
	}

	public void setWert(String wert) {
		this.wert = wert;
	}


}
