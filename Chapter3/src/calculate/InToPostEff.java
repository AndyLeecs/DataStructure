package calculate;


/**     
* @author 李安迪
* @date 2017年10月13日
* @description
*/
public class InToPostEff {


		
		public static String inToPost(String s){
			Stack<String> stack = new Stack<String>();
			String result = "";
			Queue<String> forcheck = new Queue<String>();
			for(int i = 0 ; i < s.length(); i++){
				char ch = s.charAt(i);
				String temp = ch + "";
				
				while((i+1 < s.length()) && !Hierarchy.isOperator(s.charAt(i))&&!Hierarchy.isOperator(s.charAt(i+1))){
					temp+=s.charAt(i+1);
					i++;
				}
				forcheck.push(temp);
//				System.out.println("temp:"+temp);
//				System.out.println(i);
					
			}
//			System.out.println(forcheck);	
//			System.exit(0);
			String d;
//			boolean lastIsOperator = true;
			String c;
			while(( c = forcheck.pop())!=null){
				
	//			String c = forcheck.pop();
//				System.out.println(c);
				if(!NewHierarchy.isOperator(c)){
					
					result +=c;
	//				lastIsOperator = false;
				}
				else{
					if( c .equals(")")){
						while(!stack.isEmpty()&&!(d = (String)(stack.pop())).equals("("))
							result += d;

					}
					else{
					//弹出优先级低的元素
					while(!stack.isEmpty()&&NewHierarchy.compare((String) (stack.top.data),c))
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
			String infix = "a+b*c+(23*e+f)*g";
			String postfix = inToPost(infix);

			if(postfix.equals("abc*+23e*f+g*+"))
				System.out.println("successful");
			else
				System.out.println("postfix: "+postfix);	
		}
	}


