/**
 *  功能：将考试成绩排序并输出，返回成绩的个数
 *  定义一个包含整型数组参数的方法，传入成绩数组
 *  使用Arrays类对成绩数组进行排序并输出
 *  方法执行后返回数组中元素的个数
 *  @author jerry
 *
 */
import java.util.Arrays;

public class ScoresDemo1 {
	public static void main(String[] args) {
		int[]scores={65,77,54,98,88};
		ScoresDemo1 hello=new ScoresDemo1();
		int count=hello.sort(scores);
		System.out.println("共有"+count+"个成绩.");
	}
	
	public int sort(int[]scores){
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		return scores.length;
	}
}
