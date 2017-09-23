package calculate;


/**     
* @author 李安迪
* @date 2017年9月23日
* @description 双链表链表实现的栈的栈节点,注意泛型的写法
*/
public class SingleLinkNode<T> {
	T data;
	SingleLinkNode<T> next;

	public SingleLinkNode(T data){
		this.data = data;
	}
	
	public SingleLinkNode(T data, SingleLinkNode<T> next){
		this.data = data;
		this.next = next;
	}
	
    
}
