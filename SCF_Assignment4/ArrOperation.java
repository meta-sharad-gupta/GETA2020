public class ArrOperation {
	/*
	 * finding the clumps in given array
	 * @param array : for getting values of process
	 * returning the number of clumps 
	 */
	public int clump(int array[]){
		if(array.length==0)
			throw new AssertionError("Array is Empty");
		int count=0,clumps=0;
		for(int index=0;index<array.length-1;index++){
			if(array[index]==array[index+1]){
				count++;
			}
			else{
				count=0;
			}

			if(count==1){
				clumps++;
			}
		}
		return clumps;
	}
	/*
	 * finding the the index to split the array equally
	 * @param array : for getting values of process
	 * returning the index where the arry split equally
	 */
	public int split(int array[]){
		if(array.length==0)
			throw new AssertionError("Array is Empty");
		int firstSum = 0 , secondSum = 0 , firstIndex  , lastIndex , splitIndex=0;
		for (firstIndex = -1 , lastIndex = array.length  ; firstIndex <= lastIndex;){

			if(firstSum == secondSum){
				firstIndex++;
				firstSum += array[firstIndex];
				lastIndex--;
				secondSum += array[lastIndex];
				if( firstIndex == lastIndex){
					splitIndex=-1;
				}
			}
			else if(firstSum>secondSum){
				lastIndex--;
				secondSum += array[lastIndex];

			}
			else{
				firstIndex++;
				firstSum += array[firstIndex];

			}

		}
		if(splitIndex == -1){
			return -1;
		}else{
			return firstIndex;
		}
	}
	/*
	 * to fix the x & y
	 * @param array : for getting values of process
	 * returning the array after fixing the problem
	 */
	public int[] fixXY(int[] array,int x,int y){
		if(array.length==0)
			throw new AssertionError("Array is Empty");
		if(array[array.length-1]==x)
			throw new AssertionError("X can't be the last element of array");
		int countX=0,countY=0;
		for(int index = 0;index < array.length ; index++){
			if(array[index] == x)
				countX++;
			if(array[index] == y)
				countY++;
		}
		if(countX!=countY)
			throw new AssertionError("Number of X and Y are not Equal");
		for(int index = 0;index < array.length-1 ; index++){
			if(  array[index] == x  &&  array[index+1] == x  )
				throw new AssertionError("Two consecutive x are available");
		}
		for(int index = 0;index < array.length-1 ; index++){

			if(array[index] == x && array[index+1] != y){

				for(int index2 = 0 ; index2 < array.length ; index2++){

					if(array[index2] == y){

						if(index2 == 0){
					
							array[index2] = array[index+1];
							array[index+1] = y ;
						}
						else if(array[index2-1]==x)
							continue;
						else{
							
							array[index2] = array[index+1];
							array[index+1] = y;
						}
					}	
				}	
			}
		}
		return array ;
	}
	/*
	 * finding the the total elements that are mirrored
	 * @param array : for getting values of process
	 * returning the number of elements that are mirrored
	 */
	public int MirrorSection(int[] array){

		if(array.length==0)
			throw(new AssertionError("Array Empty"));
		if(array.length==1)
			return 1;
		int mainCount=0;//variable for number of variables that can be mirrored
		for(int index = 0 ; index < array.length ; index++){
			for(int index2 = array.length-1 ; index2 >= 0 ; index2--){
				if(array[index] == array[index2]){
					int k = index ;//variale for inner loop
					int l = index2 ;
					int varCount = 0 ;
					while((l-k) >= 0 && array[k] == array[l]){
						if(l==k){//this is for case{1,2,3,2,1}
							varCount = 2 * varCount + 1;
							break;
						}
						else if(l==(k+1)){//this for case {1,2,3,3,2,1}
							varCount = 2 * (varCount + 1);
							break;
						}
						else{
							k++;
							l--;
							varCount++;
						}
					}
					if(mainCount<varCount)
						mainCount=varCount;
				}
			}
		}
		return mainCount;
	}
}