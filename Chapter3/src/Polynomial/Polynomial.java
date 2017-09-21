package Polynomial;
import java.util.LinkedList;
import java.util.ListIterator;



/**     
* @author 李安迪
* @date 2017年9月20日
* @description
*/
public class Polynomial {


	LinkedList<PolyNode> l ;
	ListIterator<PolyNode> first;

	
	public Polynomial(LinkedList<PolyNode> l){
		this.l = l;
		first = l.listIterator();
	}

	
	public String toString(){
		String s = "";
		while(first.hasNext()){
			PolyNode node = first.next();
			s+="("+node.coefficient+"x"+node.exponent+")";
		}
		return s;
		
	}
	public Polynomial addition(Polynomial p){
		ListIterator<PolyNode> second = p.first;
	    LinkedList<PolyNode> result = new LinkedList<PolyNode>();
	    
		while(second.hasNext()&&first.hasNext()){
			PolyNode firstNode = first.next();
			PolyNode secondNode = second.next();
			
			if(firstNode.exponent == secondNode.exponent){
				if(!(firstNode.coefficient == -secondNode.coefficient))
					
			
				result.add(new PolyNode(firstNode.coefficient+secondNode.coefficient,secondNode.exponent));
			}
			else if(secondNode.exponent>firstNode.exponent){
				result.add(secondNode);
				first.previous();
			}else{
				result.add(firstNode);
				second.previous();
			}
		}
			
		while(second.hasNext()){
			result.add(second.next());
		}
		
		while(first.hasNext()){
			result.add(first.next());
		}
		
		return new Polynomial(result);
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
