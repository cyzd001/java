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
		// ���÷���
		int num1 = 5;
		int num2 = 6;
		System.out.println(num1 +"��"+ num2+"�еĽϴ��ߣ�"+max(num1,num2));
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
	      //��� case ������û�� break ���ʱ��ƥ��ɹ��󣬴ӵ�ǰ case ��ʼ���������� case ��ֵ���������
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
	          System.out.print("\n���� if ���");
	          System.out.print("\n");
	       }else{
	          System.out.print("���� else ���");
	          System.out.print("\n");
	       }
	      
	      int m = 10;
		  while( m < 20 ) {
			  System.out.print("value of x : " + m );
			  m++;
			  System.out.print("\n");
		 }
		  //StringBuffer �� StringBuilder������ǰ���̰߳�ȫ�������ٶȿ�
		   StringBuffer zifu = new StringBuffer("�ҵ�����:");
		   zifu.append("pan");
		   zifu.append("da");
		   System.out.println(zifu);
		   // �ַ����ȽϺ���
		   String str = "Hello World";
		   String anotherString = "hello world";
		   Object objStr = str;
		   System.out.println( str.compareTo(anotherString) );
		   System.out.println( str.compareToIgnoreCase(anotherString) );  //���Դ�Сд
		   System.out.println( str.compareTo(objStr.toString()));
		   // �ַ������� strOrig.lastIndexOf(Stringname) ���������ַ��� Stringname �� strOrig ���ֵ�λ��
		   String strOrig = "Hello world ,Hello ";
		   int lastIndex = strOrig.lastIndexOf("Runoob");
		   if(lastIndex == -1){
			   System.out.println(lastIndex);
			   System.out.println("û���ҵ��ַ��� Runoob");
		   }else{
			   System.out.println(lastIndex);
			   System.out.println("Runoob �ַ��������ֵ�λ�ã� "+ lastIndex);
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
		System.out.println("9X9�˷���");
		for(int i=1;i <= num;i++) {	
			for(int j=1;j <=i;j++) {
				if(i == 4 && j==3) {
					System.out.print(" "+j +"*"+i+"=" +i*j+"   ");  //���������
				}
				else if(i == 3 && j==3) {
					System.out.print(" "+j +"*"+i+"=" +i*j+"   ");  //���������
				}
				else {
					System.out.print(j +"*"+i+"=" +i*j+"   ");  //���������
				}
				
			}
			System.out.println();  //�������
		}
	}
	public void jiaFa() {
		int num=9;
		System.out.println("9X9�ӷ���");
		for(int i=1;i <= num;i++) {
			for(int j=1;j <=i;j++) {
				int he = i + j;
				if (he/10 >= 1) {
					System.out.print(j +"+"+i+"=" +he+"  ");  //���������
				}else {
					System.out.print(j +"+"+i+"=" +he+"   ");  //���������
				}
				
			}
			System.out.println();  //�������
		}
	}

}




	
	     
	      

