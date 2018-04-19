/**
 * 参考注释，在代码编辑器中将代码补充完整。编写一个JAVA程序，创建指定长度的 int 型数组，并生成 100 以内随机数为数组中的每个元素赋值，然后输出数组

要求：

1、 要求通过定义带参带返回值的方法来实现

2、 通过参数传入数组的长度（例如长度为 8），方法执行后返回赋值后的数组

3、 通过 (int)(Math.random() * 100) 生成 100 以内的随机数

注：Math 类是用于进行算术操作的类，Math.random() 生成 0--1 的浮点数。 关于该类的其他应用在后面章节会有详细介绍，先熟悉随机数方法的使用~~

运行效果为： [ 2 , 52 , 8 , 26 , 66 , 32 , 98 , 0 ]
 * @author jerry
 *
 */
import java.util.Arrays;

public class ArraysDemo11 {
	public static void main(String[] args) {
		ArraysDemo11 hello=new ArraysDemo11();
		int[]nums=hello.getArrays(10);
		System.out.println(Arrays.toString(nums));
	}
	public int[] getArrays(int length){
		int[]nums=new int[length];
		for(int i=1;i<length;i++){
			nums[i]=(int)(Math.random()*100);
		}
		return nums;
	}
}
