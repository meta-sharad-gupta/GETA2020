
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Defining the zone class
 *
 */
public class Zone {
	int count = 1;
	String zoneName;
	private int zoneID;
	private final int maxCage;
	private boolean hasPark;
	private boolean hasCanteen;
	private ArrayList<Cage> cageList = new ArrayList<Cage>();
	private String category;
	private Scanner sc = new Scanner(System.in);

	/**
	 * @param zoneCapacity  define the zone capacity
	 * @param name define the zone name
	 * @param hasPark define that park is available or not
	 * @param hasCanteen define that canteen is available or not
	 * @param category define the category of the zone
	 */
	public Zone(int zoneCapacity, String name, boolean hasPark,boolean hasCanteen, String category) {
		this.maxCage = zoneCapacity;
		this.zoneName = name;
		this.hasPark = hasPark;
		this.hasCanteen = hasCanteen;
		this.zoneID = count++;
		this.category = category;
	}

	/**
	 * @param AnimalToAdded is object of the animal class
	 * @return true if animal is add in cage
	 */
	public boolean AddAnimaltoCage(Animal AnimalToAdded) {
		
		boolean cagefound = false;
				
		for ( Cage x : getCageList() ) {
			
			if ( x.animaltype == AnimalToAdded.getType() && ( !x.isFull() ) ) {
				cagefound = true;
				x.addanimal(AnimalToAdded);
				System.out.println( AnimalToAdded.getAnimalName() + " Added Successfully");
			}
		}
		
		if (!cagefound) {
			System.out.println("Cage not found");
			
			if (addCage(AnimalToAdded.getType())) {
				
				if (AddAnimaltoCage(AnimalToAdded)) {
					
//					addanimal(AnimalToAdded);
					return true;
				}
			}
		}
		else {
			
		}
		
		return false;

	}

	/**
	 * @param type is the animal name
	 * @return true if cage is added or not
	 */
	private boolean addCage(String type) {
		
		if (maxCage != getCageList().size()) {
			System.out.println("Enter capacity of new cage");
			Scanner sc = new Scanner(System.in);
			int capacity = sc.nextInt();
			Cage c = new Cage(capacity, type);
			getCageList().add(c);

			return true;
		}
		
		System.out.println("zone have reaches maximum no of cage Capacity");
		System.out.println("please Create a new Zone");
		return false;
	}

	/**
	 * @return the cage list
	 */
	public ArrayList<Cage> getCageList() {
		return cageList;
	}

	/**
	 * @return zone Id
	 */
	public int getZooID() {
		return zoneID;
	}

	/**
	 * @return true if park is in the zone
	 */
	public boolean hasPark() {
		return hasPark;
	}

	/**
	 * @return true if Canteen in zone
	 */
	public boolean hasCanteen() {
		return hasCanteen;
	}

	/**
	 * @return category of the zone
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * display the capacity and zone Id or animal name
	 */
	public void display() {
		System.out.println( "\n\nDetails Of Zone :  " + zoneID + "  Whose Name :  " + zoneName );
		System.out.println( "\ncageAnimalType\t\tCageCapacity\t\tNoofAnimalInCage" );
		for(Cage c: cageList){
			System.out.println( c.getAnimalType() +"\t\t\t\t"+ c.getCapacity() +"\t\t\t" +c.getNoOfAnimal());
			c.displayAnimal();
		}
	}

} 
