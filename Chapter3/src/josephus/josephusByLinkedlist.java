package josephus;

import java.util.LinkedList;

import Polynomial.LinkList;

/**     
* @author 李安迪
* @date 2017年9月21日
* @description josephus的链表实现，注意循环的次数。以及循环链表什么时候指向才是null
*/
public class josephusByLinkedlist {

	
	
	
	public static int play(int n, int m){
		if(m >= n || n <= 0)
			return -1;
		
		CirList l = new CirList();
		for(int i = 1 ; i <= n ; i++){
			System.out.print(i);
			l.add(i);


			System.out.println(l.get());
		}
		
		
		while(!l.isSingle()){
			
		for(int i = 1; i < m ; i++){
			l.advance();
		}
		l.delete();

		}
		
		
		
		return l.get();
	}
			
	public static void main(String args[]){
		System.out.println(josephusByLinkedlist.play(5,3));
	}
}


