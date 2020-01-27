
package intSet;

import java.util.ArrayList;

/**
 * Class Intset contains methods related to set.
 * Method to check given element is member of set.
 * Method to return the size of the set.
 * Method to check whether a given set is a subset of the main set.
 * Method to return the complement set .
 * Method to return the union of two sets.
 */
public class IntSet {

	private int[] universalSet = new int[1000];
	private int[] setArray;

	/**
	 * constructor is made for the array input.
	 * @param inputArray the input array.
	 */
	public IntSet(int[] inputArray) {

		if(inputArray.length == 0)
			throw new RuntimeException("size of array is size is zero");

		for(int index = 0; index < inputArray.length ; index++)
		{
			if(inputArray[index] < 1 || inputArray[index] > 1000)
				throw new RuntimeException("Number should be in range from 1-1000");
			if(universalSet[inputArray[index]-1]== 0)
				universalSet[inputArray[index]-1] = 1;
			else
				throw new RuntimeException("In set number"  +  inputArray[index]  +  " is multiple time");
		}

		setArray = inputArray.clone();
	}

	public int[] getArray(){
		return setArray.clone();

	}
	/**
	 * Method to find whether element is present in the set or not.
	 * @param element the element which we have to find
	 * @return method is present or not
	 * throws Exception if the element is not between 0-1000.
	 */
	public boolean isMember(int element) {

		if(element < 1 || element > 1000)
			throw new RuntimeException("Subset element should be in range of 1-1000");
		if(universalSet[element-1] == 1)
			return true;
		else
			return false;
	}
	/**
	 * Method to find the size of set.
	 * @return the size of set.
	 */
	public int size(){
		int n = setArray.length;
		return n;
	}
	/**
	 * Method to find if the given set is subset of main set.
	 * @param subSet the set which have to be checked
	 * @return true if the given set is subset.
	 * @throws Exception if the subset's element are not between 0-1000.
	 */


	public boolean isSubSet(int[] subSet) throws Exception{
		for (int index = 0; index < subSet.length ; index++){
			if(subSet[index] < 1 || subSet[index] > 1000)
				throw new Exception("Subset element should be in range of 1-1000");
			if(universalSet[subSet[index]-1] != 1){
				return false;
			}

		}

		return true;
	}
	/**
	 * 
	 * @param setArray set whose compliment is to find.
	 * @return complemet of set
	 */
	public int[] complement(int[] setArray){
		int index2 = 0;
		int[] complementArray = new int [1000-setArray.length];
		for(int index = 0 ; index < 1000 ; index++){
			if(universalSet[index] == 0){
				complementArray[index2] = index+1;
				index2++;
			}
		}
		return complementArray;
	}
	/**
	 * 
	 * @param obj1 set 1
	 * @param obj2 set 2
	 * @return union of set one and set 2
	 */
	public IntSet union(IntSet obj1, IntSet obj2) {
		int len1 = obj1.setArray.length;
		int len2 = obj2.setArray.length;

		ArrayList<Integer> union= new ArrayList<Integer>();

		for(int index = 0 ; index < len1 ; index++)
			union.add(obj1.setArray[index]);

		for(int j=0; j<len2; j++)
			if( !obj1.isMember(obj2.setArray[j]) )
				union.add(obj2.setArray[j]);

		int unionArray[] = new int[union.size()];
		for(int i=0; i<union.size(); i++)
			unionArray[i] = union.get(i);
		return new IntSet(unionArray);
	}


}
