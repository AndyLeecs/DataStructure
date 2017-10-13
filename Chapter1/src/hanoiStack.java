

/**     
* @author 李安迪
* @date 2017年10月13日
* @description 实现汉诺塔的栈
*/


public class hanoiStack {
	public static final int MAX = 64;
	char name;
	int top = 0;//栈顶的位置
	int [] plates = new int[MAX];
	
	public hanoiStack(char a){
		this.name = a;
		
	}
	
	public int top(){
		return plates[top];
	}
	
	public void push(int x){
		plates[++top] = x;
	}
	
	public int pop(){
		return plates[top--];
	}
}
