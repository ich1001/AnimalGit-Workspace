//Pollymorphism

package animalpackage;

public class AnimalSimulator {

	public static void main(String[] args) {
		
		Animal chuck = new Tiger();
		Animal henry = new Elephant();
		chuck.setLegs(4);
		
		System.out.println("Tiger legs: " + chuck.getLegs());	
		System.out.println(((Elephant)henry).getTrunk());
		Animal [] animalsArray = new Animal[5];
		
		animalsArray[0] = new Elephant();
		animalsArray[1] = new Tiger();
		
		animalsArray[0].setEyes(2);
		animalsArray[1].setEyes(3);
		
		/*System.out.println("Elephant has " + animalsArray[0].getEyes() + " eyes");
		System.out.println("Tiger has " + animalsArray[1].getEyes() + " eyes");*/
		
		if (animalsArray[1] instanceof Tiger) {
			System.out.println(((Tiger)animalsArray[1]).getEyes());
		}
		
		/*Animal clyde = new Elephant();
		clyde.setLegs(4);	
		System.out.println("Elephant has " + clyde.getLegs() + " legs");
		
		
		Animal balu = new Tiger();
		balu.setEyes(2);
		balu.setLegs(4);	
		System.out.println("Tiger has " + balu.getLegs() + " legs"); */
	}
	
}

//override, overload, instance, polymorphism, super, extends
