
public class N_Queen {
	int[][] Board;

	/**
	 * Checks if queen can be placed at that position or not.
	 * @param board : all elements of board are initially initialized to zero
	 * @param row : index of row where queen is placed
	 * @param column : index of column where queen is placed
	 * @param dimensionOfChessBoard 
	 * @return : true if queen can placed else return false 
	 */
	public boolean canPlaceQueen(int[][] board,int row,int column,int dimensionOfChessBoard)
	{ 
		Board=board;
		for(int index = 0 ; index < row ; index++)
			if(Board[index][column] == 1)
				return false ;

		for(int index = row , index2 = column ; index >= 0 && index2 >= 0 ; index-- , index2--) 
			if(Board[index][index2] == 1)
				return false;

		for(int index = row , index2 = column ; index >= 0 && index2 < dimensionOfChessBoard ; index-- , index2++) 
			if(Board[index][index2] == 1) 
				return false;

		return true;
	}
	/**
	 * Placing the queen
	 * @param board : all elements of board are initially initialized to zero 
	 * @param startRow  : it tells which row we have to avoid
	 * @param dimensionOfChessBoard
	 * @return if queens can be placed or not
	 */

	public boolean nQueen(int[][] board,int startRow,int dimensionOfChessBoard)
	{
		Board = board;
		if(startRow >= dimensionOfChessBoard) 
			return true;

		for(int index = 0 ; index < dimensionOfChessBoard ; index++) 
		{
			if(canPlaceQueen(Board , startRow , index , dimensionOfChessBoard)) 
			{ 
				Board[startRow][index] = 1;
				if(nQueen(Board , startRow + 1 , dimensionOfChessBoard))
				{
					return true;
				}
				Board[startRow][index] = 0;
			}
		}
		
		return false;
	
	}
	/**
	 * to display the output matrix
	 * @param dimensionOfChessBoard
	 */
	void print(int dimensionOfChessBoard)
	{
		System.out.println("Dimensions of board are : "  +  Board.length*Board.length  +  "\n");
		for(int index = 0 ; index < dimensionOfChessBoard ; index++){

			for(int index2 = 0 ; index2 < dimensionOfChessBoard ; index2++)
			{
				System.out.print(Board[index2][index]  +  "   ");
			}
			System.out.println("\n");
		}
		System.out.println("\n\n");
	}
}