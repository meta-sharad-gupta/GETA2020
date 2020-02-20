import java.util.ArrayList;

/**
 * define the cage class
 *
 */
public class Cage {
	public int count = 1;
	int Cagecapacity;
	public String animaltype;
	int cageId;
	private ArrayList<Animal> animalList = new ArrayList<Animal>();

	/**
	 * @param capacity define the cage capacity
	 * @param name define the name of the cage
	 */
	public Cage(int capacity, String name) {
		count++;
		this.Cagecapacity = capacity;
		this.animaltype = name;
		this.cageId = count;
	}

	/**
	 * @return true when cage is full else return false
	 */
	public Boolean isFull() {
		if (Cagecapacity == animalList.size())
			return true;
		return false;
	}

	/**
	 * @param tobeAdded is the object of animal class
	 * @return true when is add in the cage
	 */
	public boolean addanimal(Animal tobeAdded) {
		if (Cagecapacity != animalList.size() && animaltype == tobeAdded.getType()) {
			animalList.add(tobeAdded);
			return true;
		}
		return false;
	}

	/**
	 * @return animal list
	 */
	public ArrayList<Animal> getAnimalList() {
		return animalList;
	}

	/**
	 * @return animal type
	 */
	public String getAnimalType() {
		return animaltype;
	}

	/**
	 * @return the cage capacity
	 */
	public int getCapacity() {
		return Cagecapacity;
	}

	/**
	 * @return the number of animal
	 */
	public int getNoOfAnimal() {
		return animalList.size();
	}
	
	public void displayAnimal(){
		for(Animal a : animalList){
			System.out.println( a.getAnimalName() +"\t\t\t\t"+ a.getAnimalAge() +"\t\t\t" +a.getAnimalWeight() );
		}
	}

}