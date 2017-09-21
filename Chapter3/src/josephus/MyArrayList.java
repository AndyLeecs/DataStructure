package josephus;

import java.lang.reflect.Array;

/**     
* @author 李安迪
* @date 2017年9月21日
* @description
*/
public class MyArrayList {

	int[] list;
	int length;
	int pointer = -1;
	int capacity;
	
	public MyArrayList(int n){
		list = new int[n];
		length = 0;
		capacity = n;
	}
		
	//尾端插入一个节点
	public void add(int data){
		list[length] = data;
		length++;
	}
	
	public void delete(){
		System.out.println("man"+list[pointer]+"out");
		list[pointer] = 0;

		length --;
//		pointer++;
		pointer = pointer%capacity;

	}
//返回指针处的节点的数据	
	public int get(){
		while(list[pointer]== 0){

		pointer++;
		pointer = pointer%capacity;
//		System.out.println("pointer"+pointer);
		}

		return list[pointer];
	}
	
	public void advance(){

		pointer++;
//		System.out.println(pointer);
		pointer = pointer%capacity;

		while(list[pointer]== 0){

		pointer++;
		pointer = pointer%capacity;
//		System.out.println("pointer"+pointer);
		}
//		pointer++;
//		System.out.println(pointer);
//		pointer = pointer%capacity;
		
//		while(list[pointer]== 0){
//
//		pointer++;
//		pointer = pointer%capacity;
//		System.out.println("pointer"+pointer);
//		}
//		pointer++;
//		pointer = pointer%capacity;
//		System.out.println("pointer"+pointer+"man"+list[pointer]);
		
	}
	
//	public void retrieve(){
//		while(list[pointer]== 0){
//		pointer--;
//		pointer = pointer%capacity;
//		}
//		pointer--;
//		pointer = pointer%capacity;
//
//	}
	
	public boolean isSingle(){
		return length == 1;
	}
}
