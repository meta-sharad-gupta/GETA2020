
public class ArraySearch {
	/**
	 * 
	 * @param array : array containing elements
	 * @param element : element that have to be searched in array
	 * @param n : last index of array
	 * @return : index at which element is present 
	 */
	static int linearSearch(int array[], int element , int n  ){
		if(array.length == 0)
			throw new AssertionError("Array cant be empty.");
		if( array[n] == element ){
			return n+1;

		}
		else if (n == 0){
			throw new AssertionError("Number is not present in array.");
		}

		return linearSearch( array , element ,n-1);

	}
	/**
	 * 
	 * @param array : array containing elements
	 * @param element : element that have to be searched in array
	 * @param startIndex : always start from 0
	 * @param endIndex : last index of array
	* @return : index at which element is present 
	 */
	static int binarySearch(int[] array, int element, int startIndex ,int endIndex  ){
		if(array.length == 0)
			throw new AssertionError("Array cant be empty.");
		int mid;
		if(startIndex > endIndex){
			throw new AssertionError("Number is not present in array.");
		}
		if((startIndex+endIndex)%2 == 0){
			mid = (startIndex+endIndex)/2;
		}
		else{
			mid = (startIndex+endIndex+1)/2;
		}

		if( array[mid] == element){

			return mid+1;
		}
		else if(array[mid] > element){

			endIndex=mid-1;
		}
		else{
			startIndex=mid+1;
		}

		return binarySearch( array, element, startIndex , endIndex  );

	}

}
