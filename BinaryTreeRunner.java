/**
 *	BinaryTreeRunner class.
 *
 * @author  Jessica Li
 * @version 12/18/15
 */ 
public class BinaryTreeRunner
{
	/**
	 * Main method, tests all methods of BinaryTree. 
	 *
	 * @param args 		main method parameter
	 */ 
	public static void main( String[] args )
	{
		/*BinaryTree<String> b7 = new BinaryTree<String>( "7" ); 
		BinaryTree<String> b6 = new BinaryTree<String>( "6" ); 
		BinaryTree<String> b5 = new BinaryTree<String>( "5" ); 
		BinaryTree<String> b4 = new BinaryTree<String>( "4" ); 
		BinaryTree<String> b3 = new BinaryTree<String>( "3", b6, b7 ); 
		BinaryTree<String> b2 = new BinaryTree<String>( "2", b4, b5 ); 
		BinaryTree<String> b1 = new BinaryTree<String>( "1", b2, b3 ); */

		BinaryTree<String> b6 = new BinaryTree<String>( "6" ); 
		BinaryTree<String> b5 = new BinaryTree<String>( "5" ); 
		BinaryTree<String> b4 = new BinaryTree<String>( "4" ); 
		BinaryTree<String> b3 = new BinaryTree<String>( "3", b5, b6 ); 
		BinaryTree<String> b2 = new BinaryTree<String>( "2", b4, null ); 
		BinaryTree<String> b1 = new BinaryTree<String>( "1", b2, b3 ); 

		System.out.println( b1 );
		System.out.println( "size: " + b1.size() );
		System.out.println( "height: " + b1.height() );
		System.out.println( "Full: " + b1.isFull() );
		System.out.println( "Complete: " + b1.isComplete() );
		System.out.println( "Balanced: " + b1.isBalanced() );
		//System.out.println( "Leaf: " + b7.isLeaf() );


		for ( String value : b1 )
		{
			System.out.println( value.toString() );
		}

	}
}