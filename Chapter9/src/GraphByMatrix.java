import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**     
* @author 李安迪
* @date 2017年11月27日
* @description 邻接矩阵实现的图
*/
public class GraphByMatrix extends Graph{
	
	Scanner in = new Scanner(System.in);
	ArrayList<String> v = new ArrayList<String>();
	int[][] m;
	int num;
	boolean visited[];
	HashSet<String> set = new HashSet<String>();
//	String s = "";(
	
	/* (non-Javadoc)
	 * @see Graph#getGraph()
	 */
	@Override
	public void getGraph() {
		// TODO Auto-generated method stub
		//接受点的输入
		System.out.println("请输入各顶点信息,以!结束输入");
		String vertix = in.next();
		while(!vertix.equals("!")){
			v.add(vertix);
			vertix = in.next();
		}
		//建立边矩阵
		num = v.size();
		m = new int[num][num];
		visited = new boolean[num];
		for(int i = 0 ; i < num ; i++){
			visited[i] = false;
			for(int j = 0 ; j < num ; j++){
				m[i][j] = 0;
			}
		}
//		Arrays.fill(m, 0);//灵活使用arrays帮助类
		//接受边的输入
		System.out.println("请输入各边信息,格式为顶点:顶点,以!结束输入");
		String temp = in.next();
		String[] linearray;

		int from = 0;
		int to = 0;
		while(!temp.equals("!")){
			 linearray = temp.split(":");
			from = v.indexOf(linearray[0]);
			to = v.indexOf(linearray[1]);
			if(from == -1 || to == -1)
				System.out.println("顶点不存在");
			
			m[from][to] = 1;
			temp = in.next();
		}
//		for(int i = 0 ; i < num ; i++){
//			for(int j = 0 ; j < num ; j++)
//			System.out.print(m[i][j]);
//		}
//		System.out.println();
	}
	public int getFirstNeighbor(int vertex){
		for(int i = 0; i < num ; i++){
			if(m[vertex][i] == 1)
				return i;
		}
		return -1;
	};
	public int getNextNeighbor(int vertex,int thisNeighbor){
		for(int i = 0; i < num ; i++)
			if(m[vertex][i] == 1)
			{
				int j = i+1;
				while(j < num){
					if(m[vertex][j] == 1)
						return j;
				}
			}
		
		return -1;
	}
	/* (non-Javadoc)
	 * @see Graph#DFS()
	 */
	@Override
	public void DFS() {
		for(int i = 0 ; i < num ; i++){
//			Arrays.fill(visited, false);
			findCir(i,i,"");
		}
	}
	
	public void findCir(int start, int p,String s){
//		if(visited[p]){
			int j;
			if((j = s.indexOf(v.get(p)))!=-1)
			{
				String temp = "";
				while(j<s.length()){
					
					temp += s.charAt(j);
	//				System.out.print(s.charAt(j));
					
					j++;
				}
//				System.out.println(v.get(p));
				temp += v.get(p);
				set.add(temp);
				
				return;
			}
	//		return;
	else{
//			visited[p] = true;
			s+=v.get(p);
			for(int i = start ; i < num ; i++){
				boolean shouldfind = (m[p][i] == 1);
				if(shouldfind){
					
				findCir(start,i,s);
				}
			}
			
		}
	}
	/* (non-Javadoc)
	 * @see Graph#print()
	 */
	@Override
	public void print() {
		// TODO Auto-generated method stub
		Object[] list = set.toArray();
//		String[] llist = new String[list.length];
//		boolean[] relist = new boolean[list.length];
//		Arrays.fill(relist, true);
////		for(int i = 0 ; i < list.length ; i++){
//			llist[i] = ((String)list[i]).substring(0,list.length-1);
//			
//		}
//		for(int i = 0 ; i < list.length ; i++)
//			for(int j = 0 ; j < list.length ; j++)
//				if(i != j && llist[i].equals(((String)list[i]).substring(0,list.length-1)))
//					relist[j] = false;
			
		for(int j = 0 ; j < list.length ; j++)
//			if(relist[j])
				System.out.println((String)list[j]);
	}
//注意更好的做法是改进visited数组，改成三种状态，初次访问，访问其子节点，二次访问

}
