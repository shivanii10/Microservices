package spring_core;

public class Engine {
	
	String fuel;
	int nocl;
	int eno;
	
	@Override
	public String toString() {
		return "Engine [fuel=" + fuel + ", nocl=" + nocl + ", eno=" + eno + "]";
	}
	public Engine() {
		
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getNocl() {
		return nocl;
	}
	public void setNocl(int nocl) {
		this.nocl = nocl;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	

}
