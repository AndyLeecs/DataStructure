

/**     
* @author 李安迪
* @date 2017年9月5日
* @description 汉诺塔
*/
public class hanoi {
	public static void movDisks(int n , char fromTower , char toTower, char transTower){
		if(n == 1)
			System.out.println("move 1 disk from "+fromTower+" to "+toTower);
		else
		{
			movDisks(n-1,fromTower,transTower,toTower);
			System.out.println("move "+n +" disk from "+fromTower+" to "+toTower);
			movDisks(n-1,transTower,toTower,fromTower);
		}
		
	}
	

	
	public static void main(String args[]){
		movDisks(3,'A','B','C');
	}
}
