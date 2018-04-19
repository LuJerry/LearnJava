
public class OutInner {
	private int a=99;
	public class Inner{
		int b=88;
		public void test(){
			System.out.println("a:"+a);
			System.out.println("b:"+b);
		}
	}
	
	public static void main(String[]args){
		OutInner o=new OutInner();
		Inner i=o.new Inner();
		i.test();
	}
}
