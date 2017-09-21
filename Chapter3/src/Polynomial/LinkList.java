package Polynomial;


/**     
* @author 李安迪
* @date 2017年9月21日
* @description 自己实现的链表
*/
public class LinkList{

	Node head;

	
	public LinkList(){
		head = null;
		
	}
	
	public LinkList(Node node){
		head = node;
		
	}
	
	//尾端插入一个节点
	public void add(PolyNode data){
		Node temp = head;
		while(temp.next!=null)
			temp = temp.next;
		Node node = new Node(temp,data);
		node = temp.next;

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
	
	public boolean isPastEnd(){
		return head.next == null;
	}
	
}
