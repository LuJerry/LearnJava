//程序4-1：访问数组元素
import java.util.Scanner;
public class ArrayDemo {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int[] score=new int[5];
		for(int i=0;i<5;i++){
			System.out.printf("输入的第%d个整数为：",i+1);
			score[i]=sc.nextInt();
		}
		sc.close();
		System.out.print("你输入的整数是：");
//		for(int i=0;i<score.length;i++){
//			System.out.print(score[i]+",");
		for(int x:score){
			System.out.print(x+",");
		}
	}
}
