package changYong;
import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class duiQuene {
	public static void main(String[] args){
		//ArrayList数据结构
		ArrayList<Object> a = new ArrayList<Object>();
		//LinkedList数据结构
		LinkedList<Object> b = new LinkedList<Object>();
		int i;
		int num=10000000;
		for(i=0;i<num;i++){
			a.add(i,i);
		}
		for(i=0;i<num;i++){
			b.add(i,i);
		}
		long aTime1= System.currentTimeMillis();
		for(i=0;i<num;i++)
		{
			a.remove(num-1-i);
		}
		long aTime2= System.currentTimeMillis();
		long bTime1= System.currentTimeMillis();
		for(i=0;i<num;i++)
		{
			b.remove(num-1-i);
		}
		long bTime2= System.currentTimeMillis();
		System.out.println(aTime1);
		System.out.println(aTime2);
		System.out.println(bTime1);
		System.out.println(bTime2);
		System.out.println("aTime:"+(aTime2-aTime1)+"\t"+"bTime:"+(bTime2-bTime1));
		}
}


