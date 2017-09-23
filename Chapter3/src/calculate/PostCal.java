package calculate;


/**     
* @author 李安迪
* @date 2017年9月23日
* @description 后缀波兰法计算值,注意加break
*/
public class PostCal {

	public static double postCal(String s){
		double result = 0;
		Stack<Double> stack = new Stack<Double>();
		for(String c:s.split(" ")){
			System.out.println(c);
		}
		for(String c:s.split(" ")){
			double one;
			double two;
			switch(c){

				case "+":
					one = stack.pop();
					two = stack.pop();
					stack.push(one+two);
					break;
				case "-":
					one = stack.pop();
				    two = stack.pop();
					stack.push(one-two);
					break;
				case "*":
					one = stack.pop();
					two = stack.pop();
					stack.push(one*two);
					break;
				case "/":
					one = stack.pop();
					two = stack.pop();
					stack.push(one/two);
					break;
				
					default:
						stack.push(Double.valueOf(c));
				}
				
					
			}
		result = stack.pop();
		return result;
	}
	public static void main(String args[]){
		String s = "6 5 2 3 + 8 * + 3 + *";
		double result = postCal(s);
		if (result==288.0)
			System.out.println("successful");
	}
}
