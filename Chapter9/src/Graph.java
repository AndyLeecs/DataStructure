

/**     
* @author 李安迪
* @date 2017年11月27日
* @description 本题中图的接口
*/
public abstract class Graph {
	public abstract void getGraph();
public abstract int getFirstNeighbor(int vertex);
public abstract int getNextNeighbor(int vertex,int thisNeighbor);

	public abstract void DFS();
	public abstract void print();

}
