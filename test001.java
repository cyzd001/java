package seleniumTest;
import java.util.Date;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class test001 {
	public static void main(String[] args) {
		Date date = new Date();
		Calendar calendar=Calendar.getInstance();
		//年月日  也可以具体到时分秒如calendar.set(2015, 10, 12,11,32,52)
		calendar.set(2019,02,10,10,57,10);   
		Date time=calendar.getTime();  //date就是你需要的时间
		TimerTask task = new TimerTask() {
			@Override
			
			public void run() {
				int[] number = {1,2,3,4,5};
				for (int x : number) {
					System.out.println("输出数字："+x);
					System.out.println(time);
					System.out.println(new Date(date.getTime()));
					System.out.println(LocalDate.now());
					System.out.println(ZonedDateTime.now());
					System.out.println(ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME));
					System.out.println("yong timer and timertask");
					System.out.println("\n");
				};
//				System.gc();  // 停止线程
				System.exit(0); // 停止所有线程
				
			}
		};
		Timer timer = new Timer();
		long delay = 0;
		long intevalPeriod = 1 * 1000;
//		timer.scheduleAtFixedRate(task,delay,intevalPeriod);
//		timer.schedule(task,intevalPeriod,3000);
		// 设定时间点time执行任务
		timer.schedule(task,time);   
//		timer.cancel();
	}
}
