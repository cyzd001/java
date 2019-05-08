package changYong;


public class hanSu {
	String breed;
	int age;
	String color;
	final int a = 10;
	void barking(){
	}
 
	void hungry(){
	}
 
	void sleeping(){
	}
	public void testN() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// 引用方法
		int num1 = 5;
		int num2 = 6;
		System.out.println(num1 +"和"+ num2+"中的较大者："+max(num1,num2));
		// TODO Auto-generated method stub
		int i = 5;
	      switch(i){
	         case 0:
	            System.out.println("0");
	         case 1:
	            System.out.println("1");
	         case 2:
	            System.out.println("2");
	         default:
	            System.out.println("default");
	      }
	      int j = 1;
	      //如果 case 语句块中没有 break 语句时，匹配成功后，从当前 case 开始，后续所有 case 的值都会输出。
	      switch(j){
	         case 0:
	            System.out.println("0");
	         case 1:
	            System.out.println("1");
	         case 2:
	            System.out.println("2");
	         default:
	            System.out.println("default");
	      }
	      int k = 1;
	      switch(k){
	         case 0:
	            System.out.println("0");
	         case 1:
	            System.out.println("1");
	         case 2:
	            System.out.println("2");
	         case 3:
	            System.out.println("3"); 
	            break;
	         default:
	            System.out.println("default");
	      }
	      int x = 10;  
	      if( x < 20 ){
	          System.out.print("\n这是 if 语句");
	          System.out.print("\n");
	       }else{
	          System.out.print("这是 else 语句");
	          System.out.print("\n");
	       }
	      
	      int m = 10;
		  while( m < 20 ) {
			  System.out.print("value of x : " + m );
			  m++;
			  System.out.print("\n");
		 }
		  //StringBuffer 和 StringBuilder的区别：前者线程安全，后者速度快
		   StringBuffer zifu = new StringBuffer("我的名字:");
		   zifu.append("pan");
		   zifu.append("da");
		   System.out.println(zifu);
		   // 字符串比较函数
		   String str = "Hello World";
		   String anotherString = "hello world";
		   Object objStr = str;
		   System.out.println( str.compareTo(anotherString) );
		   System.out.println( str.compareToIgnoreCase(anotherString) );  //忽略大小写
		   System.out.println( str.compareTo(objStr.toString()));
		   // 字符串函数 strOrig.lastIndexOf(Stringname) 来查找子字符串 Stringname 在 strOrig 出现的位置
		   String strOrig = "Hello world ,Hello ";
		   int lastIndex = strOrig.lastIndexOf("Runoob");
		   if(lastIndex == -1){
			   System.out.println(lastIndex);
			   System.out.println("没有找到字符串 Runoob");
		   }else{
			   System.out.println(lastIndex);
			   System.out.println("Runoob 字符串最后出现的位置： "+ lastIndex);
		   }
	}
	
	public static int max(int num1,int num2) {
		int result;
		if (num1 > num2)
			result = num1;
		else
			result = num2;
		return result;
	}

	public void biao() {
		int num=9;
		System.out.println("9X9乘法表");
		for(int i=1;i <= num;i++) {	
			for(int j=1;j <=i;j++) {
				if(i == 4 && j==3) {
					System.out.print(" "+j +"*"+i+"=" +i*j+"   ");  //不换行输出
				}
				else if(i == 3 && j==3) {
					System.out.print(" "+j +"*"+i+"=" +i*j+"   ");  //不换行输出
				}
				else {
					System.out.print(j +"*"+i+"=" +i*j+"   ");  //不换行输出
				}
				
			}
			System.out.println();  //换行输出
		}
	}
	public void jiaFa() {
		int num=9;
		System.out.println("9X9加法表");
		for(int i=1;i <= num;i++) {
			for(int j=1;j <=i;j++) {
				int he = i + j;
				if (he/10 >= 1) {
					System.out.print(j +"+"+i+"=" +he+"  ");  //不换行输出
				}else {
					System.out.print(j +"+"+i+"=" +he+"   ");  //不换行输出
				}
				
			}
			System.out.println();  //换行输出
		}
	}

}




	
	     
	      

