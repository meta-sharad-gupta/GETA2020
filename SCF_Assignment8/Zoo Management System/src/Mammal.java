 /**
 * define mammal class
 */
abstract class Mammal extends Animal {
	static String MAMMAL = "Mammal";
	/**
	 * @param name define the mammal name
	 * @param age define the age of animal
	 * @param animalWeight define the mammal weight
	 */
	public Mammal(String name, int age, float animalWeight) {
		super(name, age, animalWeight);
		
	}
	
	/* (non-Javadoc)
	 * @see Animal#getCategory()
	 * return the mammal
	 */
	public String getCategory(){
		return "Mammal";
	}
	
	public abstract String getSound();
	public abstract String getType();

}