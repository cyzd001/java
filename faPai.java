
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
	    int num = a * 5;  //Ҫȡ������
	    int temp1=0;
	    int paiShu=poker().size();
	    List<Integer> number=new ArrayList<Integer>();
	    for(int i=1;i<=num;i++){
	    	temp1=random.nextInt(paiShu);//���������������Ϊ�������������
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
// * @function:�������������ȡ���ɲ��ظ�Ԫ��
// * 
// * @param paramArray:����ȡ����
// * @param count:��ȡԪ�صĸ���
// * @return:�ɳ�ȡԪ����ɵ�������
// */
//
//public static String[] getRandomArray(String[] paramArray,int count){
//    if(paramArray.length<count){
//        return paramArray;
//    }
//    String[] newArray=new String[count];
//    Random random= new Random();
//    int temp=0;//���ղ����������
//    List<Integer> list=new ArrayList<Integer>();
//    for(int i=1;i<=count;i++){
//        temp=random.nextInt(paramArray.length);//���������������Ϊ�������������
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

