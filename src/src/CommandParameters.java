//程序4-2：运行时参数的应用
public class CommandParameters {
	public static void main(String[]args){
		for(int i=0;i<args.length;i++){
			System.out.printf("第%d个输入的参数是%s\n",i,args[i]);
		}
	}
}
