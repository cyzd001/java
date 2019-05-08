package changYong;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class duiLei {
	// LinkedList队列，以堆栈运行，先进后出
	private LinkedList<String> linkedList = new LinkedList<String>();
	// ArrayList对列
	private static ArrayList<String> userlist = new ArrayList<String>();
	// LinkedList队列，以对列运行，先进先出
	private static Queue<String> queue = new LinkedList<String>();  
	public void push(String name) {
		linkedList.addFirst(name);
	}
	public String getTop() {
		return linkedList.getFirst();
	}
	public String pop() {
		return linkedList.removeFirst();
	}
	public int size() {
		return linkedList.size();
	}
	public boolean isEmpty(){  
        return linkedList.isEmpty();  
    }
	public static void main(String[] args) {
		duiLei stack = new duiLei();
		stack.push("tian long ba bu");
		stack.push("yi tian tu long ji");
		stack.push("xiao ao jiang hu");
		System.out.print("第一个元素是:\t");
		System.out.println(stack.getTop());
		System.out.println();  
        System.out.println("全部元素:");
        while(!stack.isEmpty()){  
            System.out.println(stack.pop());  
        }
        queue.offer("xiaoyun");  
        queue.offer("yulon");  
        queue.offer("羽龙共舞");  
        String element = null;  
        while((element=queue.poll())!=null){  
            System.out.println("\t"+element);  
        } 
        ArrayList<String> userlist = new ArrayList<String>();  
        userlist.add("yulon");  
        userlist.add("xiaoyun");  
        userlist.add("羽龙共舞");  
        System.out.println("使用普通for循环:");  
        for(int i=0; i<userlist.size(); i++){  
            System.out.print(userlist.get(i)+" ");  
        }  
        System.out.println();  
        System.out.println();  
        System.out.println("使用Iterator迭代器:");  
        Iterator<String> it = userlist.iterator();  
        while(it.hasNext()){  
            System.out.print(it.next()+" ");  
        }  
        System.out.println();  
        System.out.println();  
        System.out.println("使用增强for循环:");  
          
        for(String s : userlist){  
            System.out.print(s+" ");  
        }
}
}

