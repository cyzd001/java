package changYong;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class duiLei {
	// LinkedList���У��Զ�ջ���У��Ƚ����
	private LinkedList<String> linkedList = new LinkedList<String>();
	// ArrayList����
	private static ArrayList<String> userlist = new ArrayList<String>();
	// LinkedList���У��Զ������У��Ƚ��ȳ�
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
		System.out.print("��һ��Ԫ����:\t");
		System.out.println(stack.getTop());
		System.out.println();  
        System.out.println("ȫ��Ԫ��:");
        while(!stack.isEmpty()){  
            System.out.println(stack.pop());  
        }
        queue.offer("xiaoyun");  
        queue.offer("yulon");  
        queue.offer("��������");  
        String element = null;  
        while((element=queue.poll())!=null){  
            System.out.println("\t"+element);  
        } 
        ArrayList<String> userlist = new ArrayList<String>();  
        userlist.add("yulon");  
        userlist.add("xiaoyun");  
        userlist.add("��������");  
        System.out.println("ʹ����ͨforѭ��:");  
        for(int i=0; i<userlist.size(); i++){  
            System.out.print(userlist.get(i)+" ");  
        }  
        System.out.println();  
        System.out.println();  
        System.out.println("ʹ��Iterator������:");  
        Iterator<String> it = userlist.iterator();  
        while(it.hasNext()){  
            System.out.print(it.next()+" ");  
        }  
        System.out.println();  
        System.out.println();  
        System.out.println("ʹ����ǿforѭ��:");  
          
        for(String s : userlist){  
            System.out.print(s+" ");  
        }
}
}

