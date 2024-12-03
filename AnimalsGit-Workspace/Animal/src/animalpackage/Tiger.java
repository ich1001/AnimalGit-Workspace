package animalpackage;

public class Tiger extends Animal {
	private boolean claws;
	private boolean whiskers;
	private boolean stripes;
	
	
	
	
	@Override
	public void setLegs(int legs) {
		super.setLegs(legs + 1);;
	}
	
		public boolean getClaws() {
			return claws;
		}
		public void setClaws(boolean claws) {
			this.claws = claws;
		}
		public boolean getWhiskers() {
			return whiskers;
		}
		public void setWhiskers(boolean whiskers) {
			this.whiskers = whiskers;
		}
		public boolean getStripes() {
			return stripes;
		}
		public void setStripes(boolean stripes) {
			this.stripes = stripes;
		}
		
	

}
