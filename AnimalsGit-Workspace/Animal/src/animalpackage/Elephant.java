package animalpackage;


public class Elephant extends Animal {

	public String trunk;
	public String ears;
	
	public Elephant() {
		trunk = "Long";
		ears = "Huge";
	}
	
	public Elephant (int eyes, String trunk, String ears) {
		
		this.trunk = trunk;
		this.ears = ears;
	}
	
	public String getTrunk() {
		return trunk;
	}
	public void setTrunk(String trunk) {
		this.trunk = trunk;
	}
	
	public String getEars() {
		return ears;
	}
	
	public void setEars(String ears) {
		this.ears = ears;
	}
	
	

	
	}
	

