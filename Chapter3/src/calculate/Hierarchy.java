package calculate;


/**     
* @author 李安迪
* @date 2017年9月23日
* @description 方法类，判断优先级，判断字符是否为运算符
*/
public class Hierarchy {
	
	public static boolean isOperator(char c){
		if(c == '+'|| c == '-' || c == '*' || c == '/' || c == '(' || c == ')')
		return true;
		return false;
	}
	
	//判断两个字符的优先级，若第一个比第二个优先级不低，返回true
	public static boolean compare(char a, char b){
		if((a == '*' || a == '/')&&(b == '+' || b == '-'))
			return true;
		if(a == b)
			return true;
		return false;
	}
}
