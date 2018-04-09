//程序3-11：双重循环结构
public class DoubleLoop {
	public static void main(String[]args){
		for(int row=1;row<=9;row++){
			for(int col=1;col<=row;col++){
				System.out.print(row+"*"+col+"="+row*col+"\t");
			}
			System.out.println();
		}
	}
}
