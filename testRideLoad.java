package changYong;



class Animal{
	   public void move(){
	      System.out.println("��������ƶ�");
	   }
	}
class Dog extends Animal{
	   public void move(){
		  System.out.println("\t");
		  super.move();  //�����е��ø���ı���д����ʱ��Ҫʹ��super�ؼ���
	      System.out.println("�������ܺ���");
	   }
	   public void bark(){
	      System.out.println("�����Էͽ�");
	   }
	}
/*
 * ������Ҫ�����б���Ҫ�޸ģ���д�����޸�
 * ���ط������Ϳ����޸ģ���д�����޸�
 * �����쳣�����޸ģ���д���Լ��ٵ������׳��»��߸�����쳣
 * ���ط��ʿ����޸ģ���д���������ϸ����ƣ����Խ������ƣ�
 */
public class testRideLoad  {
	public int test(){
        System.out.println("test1");
        return 1;
    }
 
    public void test(int a){
        System.out.println("�����"+a);
    }
    //����������
    public String test(int a,String s){
        System.out.println("test3");
        return "returntest3";
    }   
    public String test(String s,int a){
        System.out.println("test4");
        return "returntest4";
    }   
	public static void main(String args[]){
	      Animal a = new Animal(); // Animal ����
	      Animal b = new Dog(); // Dog ����
	      a.move();// ִ�� Animal ��ķ���
	      b.move();//ִ�� Dog ��ķ���
//	      b.bark();  �������б�����Ϊ������û��bark�������,����취��b��������Animal b = new Dog()
	      testRideLoad rideLoad = new testRideLoad();
	      System.out.println(rideLoad.test());
	      rideLoad.test(3);
	      System.out.println(rideLoad.test(1,"aaaa"));
	      System.out.println(rideLoad.test("aaa",1));
	      
	   }

}
