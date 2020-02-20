/**
 * define the Pigeon class
 *
 */
public  class Pigeon extends Bird {

	/**
	 * @param name define the Pigeon name
	 * @param age define the Pigeon age
	 * @param animalWeight define the Pigeon weight
	 */
	public Pigeon(String name, int age, float animalWeight) {
		super(name, age, animalWeight);
		
	}

	/* (non-Javadoc)
	 * @see Bird#getType()
	 * return the Pigeon name
	 */
	public String getType(){
		return "Piegon";
	}

	/* (non-Javadoc)
	 * @see Bird#getSound()
	 * return the Pigeon sound
	 */
	public String getSound(){
		return "Chirp";
	}

	
}