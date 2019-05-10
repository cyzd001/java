package yichang;
import java.io.*;


public class noEnough extends Exception{
	//此处的amount用来储存当出现异常（取出钱多于余额时）所缺乏的钱
	private double amount;
	public noEnough(double amount) {
		this.amount = amount;
	}
	public double getAmount() {
		return amount;
	}
}