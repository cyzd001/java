package yichang;
import java.io.*;


public class noEnough extends Exception{
	//�˴���amount�������浱�����쳣��ȡ��Ǯ�������ʱ����ȱ����Ǯ
	private double amount;
	public noEnough(double amount) {
		this.amount = amount;
	}
	public double getAmount() {
		return amount;
	}
}