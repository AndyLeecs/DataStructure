package calculate;


/**     
* @author 李安迪
* @date 2017年10月13日
* @description
*/
public class NewHierarchy {
	public static boolean isOperator(String c){
		if(c .equals("+") || c .equals("-")  || c .equals("*")  ||c .equals("/")  || c .equals("(")  || c .equals(")") )
		return true;
		return false;
	}
	
	//判断两个字符的优先级，若第一个比第二个优先级不低，返回true
	public static boolean compare(String a, String b){
		if((a .equals("*")  ||a .equals("/") )&&(b .equals("+") || b .equals("-")  ))
			return true;
		if(a .equals(b))
			return true;
		return false;
	}
}
