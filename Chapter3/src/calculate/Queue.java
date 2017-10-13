package calculate;


/**     
* @author 李安迪
* @date 2017年10月13日
* @description
*/
public class Queue<T> {
	SingleLinkNode<T> bottom;
	SingleLinkNode<T> top;
	
	public Queue(){
		
	}
	public Queue(T c){
		bottom = new SingleLinkNode<T>(c);
		top = bottom;
	}
	
	public void push(T c){
		if(this.isEmpty()){
			bottom = new SingleLinkNode<T>(c);
            top = bottom;
		}
		else{
		SingleLinkNode<T> temp = new SingleLinkNode<T>(c);
		bottom.next = temp;
		bottom = temp;
		}
	}
	
	public T pop(){
		if(top == null)
			return null;
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
	@Override
	public String toString() {

		String s = "";
		while(!this.isEmpty()&&!top.equals(bottom)){
		SingleLinkNode<T> temp = new SingleLinkNode<T>(this.pop());
		s += temp.data;
		}
		return s;
	}

	

}
