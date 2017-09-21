package Polynomial;

import java.util.LinkedList;
import java.util.ListIterator;

/**     
* @author 李安迪
* @date 2017年9月21日
* @description
*/
public class MyPolynomial {

	LinkList l ;
	

	
	public MyPolynomial(LinkList l){
		this.l = l;
		
	}

	
	public String toString(){
		String s = "";
		while(!l.isPastEnd()){
			PolyNode node = l.get();
			s+="("+node.coefficient+"x"+node.exponent+")";
		}
		return s;
		
	}
	public MyPolynomial addition(MyPolynomial p){

	    LinkList result = new LinkList();
	    LinkList first = this.l;
	    LinkList second = p.l;
	    
		while(!second.isPastEnd()&&!first.isPastEnd()){
			PolyNode firstNode = first.get();
			PolyNode secondNode = second.get();
			
			if(firstNode.exponent == secondNode.exponent){
				if(!(firstNode.coefficient == -secondNode.coefficient))
					
			
				result.add(new PolyNode(firstNode.coefficient+secondNode.coefficient,secondNode.exponent));
				first.advance();
				second.advance();
			}
			else if(secondNode.exponent>firstNode.exponent){
				result.add(secondNode);
				second.advance();
			}else{
				result.add(firstNode);
				first.advance();
			}
		}
			
		while(!second.isPastEnd()){
			result.add(second.get());
		}
		
		while(!first.isPastEnd()){
			result.add(first.get());
		}
		
		return new MyPolynomial(result);
	}
	
	public static void main(String args[]){

		PolyNode node = new PolyNode(2,100);
		LinkedList<PolyNode> l1 = new LinkedList<PolyNode>();
		LinkedList<PolyNode> l2 = new LinkedList<PolyNode>();
		
		l1.add(node);
		node = new PolyNode(3,14);
		l1.add(node);
		node = new PolyNode(2,8);
		l1.add(node);
		node = new PolyNode(1,0);
		l1.add(node);
		
		
		node = new PolyNode(-2,100);
		l2.add(node);
		node = new PolyNode(8,14);
		l2.add(node);
		node = new PolyNode(-3,10);
		l2.add(node);
		node = new PolyNode(10,6);
		l2.add(node);
		node = new PolyNode(-1,1);
		l2.add(node);
				
		System.out.println(new Polynomial(l1));
		System.out.println(new Polynomial(l2));
		System.out.print(new Polynomial(l1).addition(new Polynomial(l2)));
		
	}
	

}
