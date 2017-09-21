package josephus;


/**     
* @author 李安迪
* @date 2017年9月21日
* @description
*/
public class CirList {
	CirNode head;

	
	public CirList(){
		head = null;
		
	}
	
	public CirList(CirNode node){
		head = node;
		
	}
	
	//尾端插入一个节点
	public void add(int data){
		CirNode temp = head;
		if(head == null){
//			System.out.println(null);
			head = new CirNode(data);
			return;
		}
		while(temp.next!=head && temp.next != null){
			temp = temp.next;
		}
		CirNode node = new CirNode(temp,data,head);
		temp.next = node;
		head.prev = node;

	}
	
	public void delete(){
		CirNode prev = head.prev;
		CirNode next = head.next;
		prev.next = next;
		next.prev = prev;
		System.out.println(head.data+"die");
		head = head.next;
	}
//返回指针处的节点的数据	
	public int get(){
		return head.data;
	}
	
	public void advance(){
		head = head.next;
	}
	
	public void retrieve(){
		head = head.prev;
	}
	
	public boolean isSingle(){
		return head.prev == head && head.next == head;
	}
	
}
