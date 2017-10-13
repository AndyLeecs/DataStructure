

/**     
* @author 李安迪
* @date 2017年9月5日
* @description 找出从自然数1, 2, …, n 中任取r个数的所有组合, 编一个递归算法.
*/
public class percussionSpecial {
	
	public static final int GAP = 48;
	
	//生成需要排列的字符
	public static void cal(int n, int r){
		
	    char[] temp = new char[n];
		for(int i =0 ; i < n ; i++){
			temp[i] = (char)(i+1+GAP); 
		}
//		System.out.print(temp);
		combination(temp,r,0,0,"");
		
	}
	

	public static void combination(char[]temp,int goal, int count,int index, String result){
		if(count == goal){
//			System.out.print(result);
			System.out.println(result);
			
		}
		else{
			for(int i = index ; i < temp.length ; i ++){
//				System.out.println(temp[i]+result);
			combination(temp,goal,count+1,i+1,temp[i]+result);
			}
		}
	}
//	public static void percussion(char[] s,int low, int high){
//		if(low >= high){
//			for(char c:s)
//			System.out.print(c);
//			System.out.println();
//		}
//		else{
//			for(int i = low ; i <= high ; i++){
//			s = swap(s,low,i);
//			percussion(s,low+1,high);
//			s= swap(s,low,i);
//			}
//		}
//		
//	}
	
	public static char[] swap(char[]s,int low , int j){
		char temp;
		temp = s[low];
		s[low] = s[j];
		s[j] = temp;
		return s;
	}

	public static void main(String args[]){
		cal(5,3);
	}
}

