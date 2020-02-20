/**
 *define the reptile class
 */
abstract class Reptile extends Animal {
	 static String REPTILE = "Reptile";
	/**
	 * @param name define the age of reptile
	 * @param age define the age of reptile
	 * @param animalWeight define the weight of reptile
	 */
	public Reptile(String name, int age, float animalWeight) {
		super(name, age, animalWeight);
		
	}
	
	/* (non-Javadoc)
	 * @see Animal#getCategory()
	 * return the reptile	 */
	public String getCategory(){
		return "Reptile";
	}
	
	public abstract String getSound();
	public abstract String getType();

}