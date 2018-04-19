/**
 *  定义一个包含整型数组参数的方法，用来接收成绩数组，进行成绩排序并输出前三名
 */
import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int[]scores={88,56,-23,75,96,45,69};
		System.out.println("考试前三名：");
		SortArray hello=new SortArray();
		hello.sortRes(scores);
	}
	
	public void sortRes(int[]scores){
		Arrays.sort(scores);
		int num=0;
		for(int i=scores.length-1;i>=0&&num<3;i--){
			if(scores[i]>100||scores[i]<0)
				continue;
			num++;
			System.out.println(scores[i]);
		}
	}
}
