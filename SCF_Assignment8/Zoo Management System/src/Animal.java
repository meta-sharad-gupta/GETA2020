/**
 * It will define properties of animal
 *
 */
public  abstract class Animal {
	int count=0;
	String AnimalName;
	float AnimalWeight;
	int AnimalAge;
	int AnimalId;
	/**
	 * @param name define the name of animal
	 * @param age defne the age of animal
	 * @param animalWeight define the weight of the animal 
	 */
	public Animal(String name,int age,float animalWeight){
		count++;
		this.AnimalId = count;
		this.AnimalName = name;
		this.AnimalWeight = animalWeight;
		this.AnimalAge = age;
	}
	
	

	/**
	 * define the animal Id
	 * @return animal Id
	 */
	public int getAnimalId(){
		return AnimalId;
	}
	
	/**
	 * define animal weight
	 * @return animal weight
	 */
	public float getAnimalWeight(){
		return AnimalWeight;
	}
	
	/**
	 * define animal age
	 * @return animal age
	 */
	public int getAnimalAge(){
		return AnimalAge;
	}
	
	/**
	 * define animal name
	 * @return animal name
	 */
	public String getAnimalName(){
		return AnimalName;
	}

	abstract public String getCategory();
	abstract public String getSound();
	abstract public String getType();
}