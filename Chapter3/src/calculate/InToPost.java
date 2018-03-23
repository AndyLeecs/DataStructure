package calculate;


/**     
* @author 李安迪
* @date 2017年9月23日
* @description 栈实现中缀表达式转后缀表达式
*/
public class InToPost {

	
	public static String inToPost(String s){
		Stack<Character> stack = new Stack<Character>();
		String result = "";
		char d;
		for(char c:s.toCharArray()){
			if(!Hierarchy.isOperator(c))
				result +=c;
			else{
				if( c == ')'){
					while((d = (stack.pop())) != '(')
						result += d;

				}
				else{
				//弹出优先级低的元素
				while(!stack.isEmpty()&&Hierarchy.compare((stack.top.data),c))
					result+=stack.pop();
				stack.push(c);
				}
				
			}
			if(!stack.isEmpty())
			System.out.println(stack.top.data);
			System.out.println(result);
		}
		System.out.println("out of loop");
		while(!stack.isEmpty())
			result+=stack.pop();
		return result;
	}
	public static void main(String args[]){
		String infix = "a+b*c+(d*e+f)*g";
		String postfix = inToPost(infix);

		if(postfix.equals("abc*+de*f+g*+"))
			System.out.println("successful");
		else
			System.out.println(postfix);	
	}
}
