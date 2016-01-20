public class BST<E extends Comparable>
{
	private BinaryTree<E> root; 

	public BST( E value )
	{
		root = new BinaryTree<E>(value); 
	} 

	public boolean add( E value )
	{
		if ( root == null )
		{
			root = new BinaryTree<E>(value); 
			return true;
		}
		else
			return add( value, root );
	}

	public boolean add( E item, BinaryTree<E> node )
	{
		//no duplicates
		if ( node.value.compareTo( item ) == 0 )
			return false; 
		if ( node.value.compareTo( item ) < 0 )
		{
			if ( node.left() == null )
			{
				node.setLeft( new BinaryTree<E>(item) ); 
				return true;
			}
			else
			{
				return add( item, node.left() );
			}
		}
		else //if ( node.value.compareTo( item ) > 0 )
		{
			if ( node.right() == null )
			{
				node.setRight( new BinaryTree<E>(item) ); 
				return true;
			}
			else
			{
				return add( item, node.right() );
			}
		}
	}

	//boolean remove, but deal with later
	//if not found in tree, return true

	//important because the one being returned has a pointer
	public BinaryTree<E> find( E value )
	{
		return contains( root, value );

	}

	public BinaryTree<E> contains( BinaryTree<E> node, E value )
	{
		if ( node.value().compareTo( value ) == 0 )
			return node; 
		else if ( node.value().compareTo( value ) < 0 )
		{
			if ( node.left() != null )
				return contains( node.left(), value );
			return null;
		}
		else
		{
			if ( node.right() != null )
				return contains( node.right() , value );
			return null;
		}

	}

	public String toString()
	{
		return root.toString(); 
	}

	public static void main( String[] args )
	{
		BST<Integer> tree = new BST<Integer>( 5 );
		System.out.println( tree.add(2) ); 
		System.out.println( tree.add(7) ); 
		System.out.println( tree.add(1) ); 
		System.out.println( tree.add(9) ); 
		System.out.println( tree.add(17) );
		System.out.println( tree.find(7) ); 

		System.out.println( tree );
	}
}