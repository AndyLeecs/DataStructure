package josephus;

import Polynomial.Node;
import Polynomial.PolyNode;

/**     
* @author 李安迪
* @date 2017年9月21日
* @description
*/
public class CirList {
	Node head;

	
	public CirList(){
		head = null;
		
	}
	
	public CirList(Node node){
		head = node;
		
	}
	
	//尾端插入一个节点
	public void add(PolyNode data){
		Node temp = head;
		while(head.next!=null)
			temp = temp.next;
		Node node = new Node(temp,data,head);
		temp.next = node;
		head.prev = node;

	}
	
	public void delete(){
		Node prev = head.prev;
		Node next = head.next;
		prev.next = next;
		next.prev = prev;
		
		head = head.next;
	}
//返回指针处的节点的数据	
	public PolyNode get(){
		return head.data;
	}
	
	public void advance(){
		head = head.next;
	}
	
	public void retrieve(){
		head = head.prev;
	}
	
	public boolean isSingle(){
		return head.next == null;
	}
	
}
