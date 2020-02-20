/**
 * define the Snake class
 *
 */
public  class Snake extends Reptile {

	/**
	 * @param name define the name of Snake
	 * @param age define the age of the Snake
	 * @param animalWeight define the weight of the Snake
	 */
	public Snake(String name, int age, float animalWeight) {
		super(name, age, animalWeight);
		
	}

	/* (non-Javadoc)
	 * @see Reptile#getType()
	 * return the Snake name
	 */
	public String getType(){
		return "Snake";
	}

	/* (non-Javadoc)
	 * @see Reptile#getSound()
	 * return the Snake sound
	 */
	public String getSound(){
		return "Hiiz";
	}

	
}