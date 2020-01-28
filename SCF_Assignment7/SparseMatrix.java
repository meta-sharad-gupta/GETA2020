
public class SparseMatrix {
	private int[][] sparseMatrix;
	private int count=0;
	private int column;
	private int row;

	public SparseMatrix(int[][] inputMatrix) {

		if(inputMatrix.length == 0)
			throw new AssertionError("Matrix cant be empty");

		row = inputMatrix.length;//rows of input matrix
		sparseMatrix = new int[(inputMatrix.length)*(inputMatrix[0].length)][3];//sparse matrix for row , column , value form 
		column=inputMatrix[0].length;//column of input matrix

		for(int  index1 =0 ; index1 < row ; index1++){

			if(inputMatrix[index1].length != column)
				throw new AssertionError("Columns cant be different in every row");
			//to convert the given matrix in sparse form
			for(int index2 = 0 ; index2 < column ; index2++){

				if(inputMatrix[index1][index2] != 0){
					sparseMatrix[count][0] = index1;
					sparseMatrix[count][1] = index2;
					sparseMatrix[count][2] = inputMatrix[index1][index2];
					count ++ ;
				}
			}
		}
		if(((inputMatrix.length)*(inputMatrix[0].length))/2<count)//condition to check if the matrix is sparse matrix or not.
			throw new AssertionError("Matrix is not sparse matrix.");
	}
/**
 * Method to find transpose of matrix
 * @return transpose matrix
 */
	public int[][] transposeMatrix(){
		int[][]resultMatrix;
		//conditions for dimension of transpose matrix
		if(row==column)
			resultMatrix=new int[row][column];
		else
			resultMatrix=new int[column][row];
		//loop for saving the transpose matrix
		for(int index = 0 ; index < count ; index++){
			resultMatrix[sparseMatrix[index][1]][sparseMatrix[index][0]]=sparseMatrix[index][2];
		}
		return resultMatrix;
	}
/**
 * Method to check if Sparse Matrix is Symmetric or not
 * @return true or false
 */
	public boolean checkSymmetrical(){
		if(row!=transposeMatrix().length||column!=transposeMatrix()[0].length){
			return false;
		}
		SparseMatrix obj=new SparseMatrix(transposeMatrix());
		boolean flag=true;
		for(int index = 0 ; index < count ; index++){

			if(sparseMatrix[count][0]==obj.sparseMatrix[count][0] 
					&& sparseMatrix[count][1]==obj.sparseMatrix[count][1] 
							&& sparseMatrix[count][2]==obj.sparseMatrix[count][2] 
					){
				flag=true;
			}else {
				flag= false;
				break;
			}
		}
		return flag;
	}
/**
 * Method to find addition of two sparse  matrix
 * @param firstMatrix 1st matrix
 * @param secondMatrix 2nd matrix
 * @return addition of 1st and second matrix
 */
	public static int[][] addMatrix(SparseMatrix firstMatrix,
			SparseMatrix secondMatrix){

		int firstRows=firstMatrix.row;
		int firstColumns=firstMatrix.column;
		int secondRows=secondMatrix.row;
		int secondColumns=secondMatrix.column;

		if(firstRows!=secondRows || firstColumns!=secondColumns)
			throw new AssertionError("Addition condition is not satistfied");

		int[][]resultMatrix=new int[firstRows][firstColumns];

		for(int index = 0 ; index  < firstMatrix.count ; index ++){
			resultMatrix[firstMatrix.sparseMatrix[index][0]]
					[firstMatrix.sparseMatrix[index][1]] += firstMatrix.sparseMatrix[index][2];
		}

		for(int index = 0 ; index < secondMatrix.count ; index ++){
			resultMatrix[secondMatrix.sparseMatrix[index ][0]]
					[secondMatrix.sparseMatrix[index ][1]] += secondMatrix.sparseMatrix[index ][2];
		}

		return resultMatrix;
	}
	/**
	 * Method to find multiplication of two sparse matrix.
	 * @param firstMatrix
	 * @param secondMatrix
	 * @return multiplied matrix
	 */
	public static int[][] multiplyMatrix(SparseMatrix firstMatrix,
			SparseMatrix secondMatrix){
		int firstRows=firstMatrix.row;
		int firstColumns=firstMatrix.column;
		int secondRows=secondMatrix.row;
		int secondColumns=secondMatrix.column;
		if(firstColumns!=secondRows)
			throw new AssertionError("Multiplication condition is not satisfied.");
		
		int[][]resultMatrix=new int[firstRows][secondColumns];
 
		for(int index = 0 ; index < firstMatrix.count ; index++){
			for(int index2 = 0 ; index2 < secondMatrix.count ; index2++){
				if(firstMatrix.sparseMatrix[index][1] == secondMatrix.sparseMatrix[index2][0]){
					resultMatrix[firstMatrix.sparseMatrix[index][0]][secondMatrix.sparseMatrix[index2][1]] += 
							firstMatrix.sparseMatrix[index][2]*secondMatrix.sparseMatrix[index2][2];
				}
			}
		}

		return resultMatrix;
	}
}
