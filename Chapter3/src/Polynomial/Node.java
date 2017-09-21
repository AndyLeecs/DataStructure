package Polynomial;
/**     
* @author 李安迪
* @date 2017年9月21日
* @description
*/
public class Node {

	PolyNode data;
	Node next;
	Node prev;
	
	public Node(PolyNode data){
		this.data = data;
		next = null;
		prev = null;
	}
	
	public Node(PolyNode data, Node next){
		this.data = data;
		this.next = next;
	
	}
	
	public Node(Node prev,PolyNode data){
		this.data = data;
		this.prev = prev;
	}
	
	public Node(Node prev, PolyNode data, Node next){
		this.data = data;
		this.prev = prev;
		this.next = next;
	}
	

}
