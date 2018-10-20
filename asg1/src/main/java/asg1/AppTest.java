package asg1;

public class AppTest {

	public static void main(String args[]) throws Exception {
		System.out.println("Converting file..");
		asg1_RealTime.searchInfo();
		writeExcel.main(args);
	}
}
