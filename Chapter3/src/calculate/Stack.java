package calculate;


/**     
* @author 李安迪
* @date 2017年9月23日
* @description 实现一个栈,注意实现链表时好好考虑链接的方向，同时首次利用了泛型
*/
public class Stack<T> {
	SingleLinkNode<T> bottom;
	SingleLinkNode<T> top;
	
	public Stack(){
		
	}
	public Stack(T c){
		bottom = new SingleLinkNode<T>(c);
		top = bottom;
	}
	
	public void push(T c){
		if(this.isEmpty())
			top = new SingleLinkNode<T>(c);
		else{
		SingleLinkNode<T> temp = top;
		top = new SingleLinkNode<T>(c);
		top.next = temp;
		}
	}
	
	public T pop(){
		T c = top.data;
		top = top.next;
		return c;
	}
	
//	public boolean contains(char c){
//		SingleLinkNode<Character> temp = bottom;
//		while(temp!= null){
//			if(temp.data == c)
//				return true;
//			temp = temp.next;
//		}
//		
//		return false;
//	}
	public boolean isEmpty(){
		if(top == null && bottom == null)
			return true;
		else
			return false;
	}

	public void clear(){
		top = null;
		bottom = null;
	}
}
