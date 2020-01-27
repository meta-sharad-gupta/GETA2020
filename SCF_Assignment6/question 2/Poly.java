
public class Poly {
	private final int polyArray[][];

	Poly(int[][] array){
		if ( array.length == 0 )
			throw new AssertionError();
		polyArray = array.clone();
	}

	public int[][] getPolyArray() {
		return polyArray.clone();
	}
	/**
	 * Method will sort the array according to power.
	 * @param array here we are sorting the given array according to its power.
	 * @return sorted array
	 */
	private int[][] sorting(int[][] array){
		int swapDegree, swapCoff, len=array.length;
		for ( int i=0; i<len-1; i++ )
			for ( int j=0; j<len-1; j++ )
				if ( array[j][1] < array[j+1][1] ){
					swapCoff = array[j+1][0];
					array[j+1][0] = array[j][0];
					array[j][0] = swapCoff;
					swapDegree = array[j+1][1];
					array[j+1][1] = array[j][1];
					array[j][1] = swapDegree;
				}
		return array;
	}
	/**
	 * Method will return the evaluation of polynomial
	 * @param d the value for which the polynomial have to evaluated
	 * @return the evaluated value.
	 */
	public float evaluate(float d){
		float totalSum=0;
		for ( int i=0; i<polyArray.length; i++ )
			totalSum += polyArray[i][0]*Math.pow(d,polyArray[i][1]);
		return totalSum;
	}
	/**
	 * Method will return the highest degree of polynomial.
	 * @return the value of highest degree.
	 */
	public int degree(){
		int[][] array = sorting(this.polyArray);
		return array[0][1];
	}
	/**
	 * Method will return the addition of two polynomial.
	 * @param obj1 polynomial one
	 * @param obj2 polynomial two
	 * @return addition of polynomial one and two
	 */
	public boolean addPoly(Poly obj1, Poly obj2){
		int array1[][] = sorting(obj1.polyArray), i=0, j=0, k=0;
		int[][] array2 = sorting(obj2.polyArray);
		int addArray[][] = new int[array1.length+array2.length][2];
		while( i < array1.length && j < array2.length){
			if ( array1[i][1] == array2[j][1] ){
				addArray[k][0] = array1[i][0] + array2[j][0];
				addArray[k][1] = array1[i][1];
				i++;k++;j++;
			}
			else if ( array1[i][1] > array2[j][1]){
				addArray[k][0] = array1[i][0];
				addArray[k][1] = array1[i][1];
				i++;k++;
			}
			else{
				addArray[k][0] = array2[j][0];
				addArray[k][1] = array2[j][1];
				k++;j++;
			}
		}

		while ( i < array1.length ){
			addArray[k][0] = array1[i][0];
			addArray[k][1] = array1[i][1];
			k++;i++;
		}
		while( j < array2.length ){
			addArray[k][0] = array2[j][0];
			addArray[k][1] = array2[j][1];
			j++;k++;
		}
		System.out.print("Addition is : ");
		for ( i = 0 ; i < addArray.length; i++ ){
			if(addArray[i][0] != 0){
				if(i == addArray.length-1)
					System.out.print(addArray[i][0]  +  "X^"  +  i  );
				else
					System.out.print(addArray[i][0]  +  " X^"  +  i  +  " + ");
			}
		}
		System.out.println("\n");
		return true;
	}
	/**
	 * Method will return the Multiplication of two polynomial.
	 * @param obj1 polynomial one
	 * @param obj2 polynomial two
	 * @return multiplication of polynomial one and two
	 */
	public boolean multiplyPoly(Poly obj1, Poly obj2){
		int array1[][] = sorting(obj1.polyArray), coff=0, pow=0;
		int[][] array2 = sorting(obj2.polyArray);
		int size = array1[0][1]+array2[0][1];
		int multiArray[][] = new int[size+1][2];
		for(int i=0; i<array1.length; i++)
			for(int j=0; j<array2.length; j++)
			{
				coff = array1[i][0]*array2[j][0];
				pow = array1[i][1]+array2[j][1];
				multiArray[pow][0] += coff;
				multiArray[pow][1] = pow;
			}
		System.out.print("Multiplication is : ");
		for ( int i  =  0  ; i  <  multiArray.length  ;  i++ ){
			if(multiArray[i][0] != 0){
				if(i == multiArray.length-1)
					System.out.print(multiArray[i][0]  +  "X^"  +  i  );
				else
					System.out.print(multiArray[i][0]  +  " X^"  +  i  +  " + ");
			}
		}
		System.out.println("\n");
		return true;
	}


}
