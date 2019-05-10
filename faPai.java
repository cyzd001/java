
package changYong;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Random;


public class faPai {
	public List<Map<Integer,Integer>> poker() {	
	List<Map<Integer,Integer>> list=new ArrayList<Map<Integer,Integer>>();	
    for(int i=1;i<5;i++) {
    	for(int j=1;j<14;j++) {
    		Map<Integer,Integer> nums= new HashMap<Integer, Integer>();
    		nums.put(i,j);
    		list.add(nums);
    	}
    }
    return list;
    }
	
	public void getPai(int a) {
		Random random= new Random();
		List<Map<Integer,Integer>> lit=new ArrayList<Map<Integer,Integer>>();
	    int num = a * 5;  //要取的牌数
	    int temp1=0;
	    int paiShu=poker().size();
	    List<Integer> number=new ArrayList<Integer>();
	    for(int i=1;i<=num;i++){
	    	temp1=random.nextInt(paiShu);//将产生的随机数作为被抽数组的索引
	    	if(!(number.contains(temp1))) {
	    		System.out.print(temp1+"**");
	    		number.add(temp1);
	    	}else {
	    		i--;
	    	}
	        }
	    System.out.println("++");
	    System.out.println(paiShu);
	    System.out.println(number.size());
	    System.out.println("*******");
	    }
	
}

///**
// * @function:从数组中随机抽取若干不重复元素
// * 
// * @param paramArray:被抽取数组
// * @param count:抽取元素的个数
// * @return:由抽取元素组成的新数组
// */
//
//public static String[] getRandomArray(String[] paramArray,int count){
//    if(paramArray.length<count){
//        return paramArray;
//    }
//    String[] newArray=new String[count];
//    Random random= new Random();
//    int temp=0;//接收产生的随机数
//    List<Integer> list=new ArrayList<Integer>();
//    for(int i=1;i<=count;i++){
//        temp=random.nextInt(paramArray.length);//将产生的随机数作为被抽数组的索引
//        if(!(list.contains(temp))){
//            newArray[i-1]=paramArray[temp];
//            list.add(temp); 
//        }
//        else{
//            i--;
//        }
//    }
//    return newArray;
//}

