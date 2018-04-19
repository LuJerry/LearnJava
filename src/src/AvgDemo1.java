/**
 * 功能：计算两门课程考试成绩的平均分并输出平均分
 * 定义一个包含两个参数的方法，用来传入两门课程的成绩
 * @author jerry
 *
 */
public class AvgDemo1 {
	public static void main(String[] args) {
		AvgDemo1 hello=new AvgDemo1();
		double res=hello.calcAvg(81, 94);
		System.out.println("平均分:"+res);
	}

	public double calcAvg(int num1,int num2){
		double sum=num1+num2;
		double avg=sum/2;
		return avg;
	}
}