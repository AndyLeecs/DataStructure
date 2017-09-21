package josephus;


/**     
* @author 李安迪
* @date 2017年9月21日
* @description
*/
public class josephusByArray {
	
	public static int play(int n, int m){
		if(m >= n || n <= 0)
			return -1;
		
		MyArrayList l = new MyArrayList(n);
		for(int i = 1 ; i <= n ; i++){
//			System.out.print(i);
			l.add(i);



		}
			
		while(!l.isSingle()){

		for(int i = 1; i <= m ; i++){
//			System.out.println("count"+i);
			l.advance();
		}
		l.delete();

		}
	
		return l.get();
	}
			
	public static void main(String args[]){
		System.out.println(josephusByArray.play(8,3));
	}
}
