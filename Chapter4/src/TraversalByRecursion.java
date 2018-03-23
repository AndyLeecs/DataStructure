

/**     
* @author 李安迪
* @date 2017年10月20日
* @description
*/
public class TraversalByRecursion {
	public static void main(String args[]){

		BinaryNode tree = new BinaryNode('i');
		BinaryNode treeleft = new BinaryNode('h');
		tree = new BinaryNode(treeleft,'f',tree);
		treeleft = new BinaryNode('g');
		treeleft = new BinaryNode('e',treeleft);
		tree = new BinaryNode(treeleft,'c',tree);
		treeleft = new BinaryNode('d');
		treeleft = new BinaryNode(treeleft,'b');
		tree = new BinaryNode(treeleft,'a',tree);
//		
		System.out.println(PreOrder(tree));
		System.out.println(InOrder(tree));
		System.out.println(PostOrder(tree));
		
	}
	public static String PreOrder = "";
	public static String InOrder = "";
	public static String PostOrder = "";
	public static String PreOrder(BinaryNode tree){
		
		if(tree != null)
		{
			PreOrder += (char)tree.element;
			PreOrder(tree.left);
			PreOrder(tree.right);
		}
		return PreOrder;
	}
	
	public static String InOrder(BinaryNode tree){
		
		if(tree != null)
		{
			InOrder(tree.left);
			InOrder += (char)tree.element;
			InOrder(tree.right);
		}

		return InOrder;
	}
	
	public static String PostOrder(BinaryNode tree){
		
		if(tree != null)
		{
			
			PostOrder(tree.left);
			PostOrder(tree.right);
			PostOrder += (char)tree.element;
		}

		return PostOrder;
	}
}
