package changYong;

public class MainApp {
	public static void main(String[] args) {
		int[] list = {1,2,3,4,5,6};
		Solution solution = new Solution(list);
		System.out.println(list[0]);
		for(int element:solution.shuffle()) {
			System.out.print(element);
		}
		System.out.println("");
		System.out.println("");
		System.out.println(solution.shuffle()[0]);
		int[] nums = {8,2,4,10,5};		
		hanSu test = new hanSu();
		faPai fapai =new faPai();
		fapai.getPai(3);
		System.out.println(fapai.poker());
		test.paixing(nums);
		test.biao();
		test.jiaFa();
		System.out.println("");
		System.out.println(test.a);		
	}
	
}
