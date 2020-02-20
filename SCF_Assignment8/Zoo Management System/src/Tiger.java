/**
 * define the Tiger class
 *
 */
public  class Tiger extends Mammal {

	/**
	 * @param name  define the tiger name
	 * @param age define the tiger age
	 * @param animalWeight define the tiger weight
	 */
	public Tiger(String name, int age, float animalWeight) {
		super(name, age, animalWeight);
		
	}

	/* (non-Javadoc)
	 * @see Mammal#getType()
	 * return the animal name
	 */
	public String getType(){
		return "Tiger";
	}

	/* (non-Javadoc)
	 * @see Mammal#getSound()
	 * return the animal sound
	 */
	public String getSound(){
		return "Roar";
	}

}