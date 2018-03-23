

/**     
* @author 李安迪
* @date 2017年10月20日
* @description
*/
public class BinaryNode {
	Object element;
	BinaryNode left;
	BinaryNode right;
	
	public BinaryNode(){
		left = right = null;
	}
	
	public BinaryNode(Object element){
		this.element = element;
		left = right = null;
	}
	
	public BinaryNode(BinaryNode left,Object element){
		this.element = element;
		this.left = left;
	}
	
	public BinaryNode(Object element, BinaryNode right){
		this.element = element;
		this.right = right;
	}
	public BinaryNode(BinaryNode left,Object element,BinaryNode right){
		this.element = element;
		this.left = left;
		this.right = right;
	}
}
