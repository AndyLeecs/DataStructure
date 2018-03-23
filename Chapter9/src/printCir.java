

/**     
* @author 李安迪
* @date 2017年11月27日
* @description 判别一个有向图中是否有环路，并把环路打印出来
*/
public class printCir {
	public static void main(String[] args){
//		Graph g = new GraphByList();
		Graph g = new GraphByMatrix();
		g.getGraph();
		System.out.println("get graph");
		g.DFS();
		g.print();
	}
}
