import java.util.Stack;

/**     
* @author 李安迪
* @date 2017年10月20日
* @description
*/
public class TraversalByNonRecursion {
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
		
       PreOrder(tree);
		System.out.println();
		InOrder(tree);
		System.out.println();
		PostOrder(tree);
		
	}
	public static String s;
	public static void PreOrder(BinaryNode tree){
		Stack<BinaryNode> stack = new Stack<BinaryNode>();
		BinaryNode n = tree;
		if(n!=null){
			stack.push(n);
			while(!stack.isEmpty()){
				n = stack.pop();
				System.out.print(n.element);
				if(n.right!=null)
					stack.push(n.right);
				if(n.left!=null)
					stack.push(n.left);
			}
		}
		
		return;
	}
	
	public static void InOrder(BinaryNode tree){
		Stack<BinaryNode> stack = new Stack<BinaryNode>();
		BinaryNode n = tree;
		while(true){
		while(n != null){
			stack.push(n);
			n = n.left;
		}
		if(!stack.isEmpty()){
			n = stack.pop();
			System.out.print((char)n.element+"");
			n = n.right;
		}else return;
	

	}
	}
	
	public static void PostOrder(BinaryNode tree){
		Stack<sNode> stack = new Stack<sNode>();
		
		BinaryNode n = tree;
		boolean tag;
		sNode sNode = new sNode();
		
		while(true){
		while(n != null){
			sNode = new sNode(n);
			stack.push(sNode);
			n = n.left;
		}
		sNode = stack.pop();
		n = sNode.node; 
		
		
		while(sNode.tag){
			System.out.print((char)n.element+"");
			if(!stack.isEmpty()){
				sNode = stack.pop();
			
				n = sNode.node; 
			}else return;
		}
		sNode.tag =true;
		stack.push(sNode);
		n = n.right;
		}
	}

	
}
