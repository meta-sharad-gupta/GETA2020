import static org.junit.Assert.*;
import org.junit.Test;
/**
 * Class SparseMatrixTest  contains the test cases of sparse matrix
 *
 */
public class SparseMatrixTest {

	@Test
	public void testTranspose(){
		SparseMatrix obj=new SparseMatrix(
				new int[][]{
						{0,0,4,8},
						{1,0,0,5},
						{0,0,0,0},
						{0,2,0,0}
				}
				);
		int res[][]=obj.transposeMatrix();
		int ans[][]=new int[][]{
				{0,1,0,0},
				{0,0,0,2},
				{4,0,0,0},
				{8,5,0,0}
		};
		assertArrayEquals(ans, res);
	}

	@Test
	public void testSymmetric(){
		SparseMatrix obj=new SparseMatrix(
				new int[][]{
						{1,0,0,1},
						{0,0,0,0},
						{0,0,0,0},
						{1,0,0,1}
				}
				);
		boolean result=obj.checkSymmetrical();
		assertEquals(true, result);
	}

	@Test
	public void testAddMatrix(){
		SparseMatrix obj1=new SparseMatrix(
				new int[][]{
						{0,0,4,8},
						{1,0,0,5},
						{0,0,0,0},
						{0,2,0,0}
				}
				);
		SparseMatrix obj2=new SparseMatrix(
				new int[][]{
						{2,0,4,7},
						{1,0,0,6},
						{0,0,5,0},
						{0,4,0,0}
				}
				);
		int ans[][]=new int[][]{
				{2,0,8,15},
				{2,0,0,11},
				{0,0,5,0},
				{0,6,0,0}
		};
		assertArrayEquals(ans, SparseMatrix.addMatrix(obj1, obj2) );
	}

	@Test
	public void TestSparseMtrix_multiplyMatrix(){
		int[][] arr = new int[][]{
				{5,0,3},
				{2,0,0},
				{1,0,0}
		};
		SparseMatrix s1 = new SparseMatrix(arr);

		int[][] brr = new int[][]{
				{0,0,0,1},
				{2,3,0,0},
				{1,0,1,0}
		};
		SparseMatrix s2 = new SparseMatrix(brr);

		int[][] res = new int[][]{
				{3,0,3,5},
				{0,0,0,2},
				{0,0,0,1}
		};
		int[][] ans = SparseMatrix.multiplyMatrix(s1, s2);
		assertArrayEquals(ans,res);
	}

}
