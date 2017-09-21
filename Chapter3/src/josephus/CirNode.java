package josephus;



/**     
* @author 李安迪
* @date 2017年9月21日
* @description
*/
public class CirNode {
	public int data;
	public CirNode next;
	public CirNode prev;
	
	public CirNode(int data){
		this.data = data;
		next = null;
		prev = null;
	}
	
	public CirNode(int data, CirNode next){
		this.data = data;
		this.next = next;
	
	}
	
	public CirNode(CirNode prev,int data){
		this.data = data;
		this.prev = prev;
	}
	
	public CirNode(CirNode prev, int data, CirNode next){
		this.data = data;
		this.prev = prev;
		this.next = next;
	}
}
