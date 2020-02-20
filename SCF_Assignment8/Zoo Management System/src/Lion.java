/**
 *define the lion class
 */
public  class Lion extends Mammal {

	/**
	 * @param name define the name of lion 
	 * @param age define the age of lion
	 * @param animalWeight define the weight of lion
	 */
	public Lion(String name, int age, float animalWeight) {
		super(name, age, animalWeight);

	}

	/* (non-Javadoc)
	 * @see Mammal#getType()
	 * return the animal name
	 */
	public String getType(){ 
		return "Lion";
	}

	/* (non-Javadoc)
	 * @see Mammal#getSound()
	 * return the lion sound
	 */
	public String getSound(){
		return "Roar";
	}

}