package josephus;

import java.util.LinkedList;

/**     
* @author 李安迪
* @date 2017年9月21日
* @description
*/
public class josephusByLinkedlist {

	
	
	
	public static int play(int n, int m){
		if(m >= n || n <= 0)
			return -1;
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		for(int i = 1 ; i <= n ; i++){
			l.add(i);
		}
		
		for(int i = 1; i < n ; i++){
		
		}
		return 0;
	}
			
	public static void main(String args[]){
		System.out.println(josephusByLinkedlist.play(8,3));
	}
}


