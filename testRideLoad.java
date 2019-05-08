package changYong;



class Animal{
	   public void move(){
	      System.out.println("动物可以移动");
	   }
	}
class Dog extends Animal{
	   public void move(){
		  System.out.println("\t");
		  super.move();  //子类中调用父类的被重写方法时，要使用super关键字
	      System.out.println("狗可以跑和走");
	   }
	   public void bark(){
	      System.out.println("狗可以吠叫");
	   }
	}
/*
 * 重载需要参数列表需要修改，重写不能修改
 * 重载返回类型可以修改，重写不能修改
 * 重载异常可以修改，重写可以减少但不能抛出新或者更广的异常
 * 重载访问可以修改，重写不能做更严格限制（可以降低限制）
 */
public class testRideLoad  {
	public int test(){
        System.out.println("test1");
        return 1;
    }
 
    public void test(int a){
        System.out.println("输出："+a);
    }
    //下面是重载
    public String test(int a,String s){
        System.out.println("test3");
        return "returntest3";
    }   
    public String test(String s,int a){
        System.out.println("test4");
        return "returntest4";
    }   
	public static void main(String args[]){
	      Animal a = new Animal(); // Animal 对象
	      Animal b = new Dog(); // Dog 对象
	      a.move();// 执行 Animal 类的方法
	      b.move();//执行 Dog 类的方法
//	      b.bark();  此行运行报错，因为父类中没有bark这个方法,解决办法将b这样定义Animal b = new Dog()
	      testRideLoad rideLoad = new testRideLoad();
	      System.out.println(rideLoad.test());
	      rideLoad.test(3);
	      System.out.println(rideLoad.test(1,"aaaa"));
	      System.out.println(rideLoad.test("aaa",1));
	      
	   }

}
