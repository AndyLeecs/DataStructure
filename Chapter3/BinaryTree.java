import java.util.Stack;

/**     
* @author 李安迪
* @date 2017年10月20日
* @description
*/
public class BinaryTree {
	public static BinaryNode makeTreeByPostFix(String postfix){
		char[] input = postfix.toCharArray();
		Stack<BinaryNode> stack = new Stack<BinaryNode>();
		BinaryNode result = new BinaryNode();
		BinaryNode treeOne = null;
		BinaryNode treeTwo = null;
		BinaryNode tree = null;
		for(char c:input){
			if(Hierarchy.isOperator(c)){
				if(!stack.isEmpty())
				treeOne = stack.pop();
				if(!stack.isEmpty())
				treeTwo = stack.pop();
				result = new BinaryNode(treeTwo,c,treeOne);
				stack.push(result);
			}else if(Hierarchy.isSingleOperator(c)){
				if(!stack.isEmpty())
					tree = stack.pop();
				tree = new BinaryNode(c,tree);
				stack.push(tree);
			}
			else{
				tree = new BinaryNode(c);
				stack.push(tree);
			}
		}
		return stack.pop();
	}
	
	
}
