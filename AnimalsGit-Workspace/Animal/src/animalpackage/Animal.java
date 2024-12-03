package animalpackage;

public class Animal {		
	private int eyes;
	private int legs;
	private String fly;
	
	public Animal() {
		eyes = 2;
		legs = 4;
		fly = "No fly";
	}
	
	public Animal(int eyes, int legs, String fly) {
		this.eyes = eyes;
		this.legs = legs;
		this.fly = fly;
		
	}
	
	public int getEyes() {
		return eyes;
	}
	
	public void setEyes(int eyes) {
		this.eyes = eyes;
	}
	
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	
}

	

		
		
	
	
