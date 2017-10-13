

/**     
* @author 李安迪
* @date 2017年9月5日
* @description 汉诺塔
*/
public class hanoiByNonPercussion {
	static char [] location = {'A','B','C'};
	static hanoiStack [] column = {new hanoiStack('A'),new hanoiStack('B'),new hanoiStack('C')};
	public static void movDisks(int n , char fromTower , char toTower, char transTower){
		//如果n是偶数，调换B,C两个柱子的位置
		if(n%2 == 0){
			hanoiStack temp = column[1];
			column[1] = column[2];
			column[2] = temp;
		}
		//初始化汉诺塔的第一个柱子,从大到小
		for(int i = 0 ; i < n; i++ ){
		//	column[0].push(i+1);
			column[0].plates[i] = n - i;
		
		}
		column[0].top = n - 1;
		
		
		int total = (int) Math.pow(2, n)-1;
		int i = 0;
		int k = 0;//移动了几次
		int now;//现在移动的圆盘
		
	    while(k < total){
	    	//按顺时针把圆盘i从现在的柱子移动到下一根柱子
//	    	System.out.println(i);
	    	now = column[i%3].pop();
//	    	System.out.println(now);
	    	column[(i+1)%3].push(now);
	    	System.out.println("move "+(now) +" disk from "+column[i%3].name+" to "+column[(i+1)%3].name);
	    	i++;
	    	k++;
	    	
	    	
	    	//把另外两根柱子的圆盘移动,把非空移动到空,如果都非空，比较最顶上的元素，把小的移动到大的
	    	if(k < total){
	    		if(column[(i+1)%3].top() == 0 || column[(i-1)%3].top() > 0 && column[(i+1)%3].top() > column[(i-1)%3].top())
	    		{
	    			now = column[(i-1)%3].pop();
	    			
	    			column[(i+1)%3].push(now);
	    			System.out.println("move "+(now) +" disk from "+column[(i-1)%3].name+" to "+column[(i+1)%3].name);
	    		}else{
                    now = column[(i+1)%3].pop();
	    			
	    			column[(i-1)%3].push(now);
	    			System.out.println("move "+(now) +" disk from "+column[(i+1)%3].name+" to "+column[(i-1)%3].name);
	    		}
	    		k++;
	    	}
	    
	    	
	    }
		
			
	}
	

	
	public static void main(String args[]){
		movDisks(3,'A','B','C');
	}
}
