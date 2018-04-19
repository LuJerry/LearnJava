
public class TryCatchTest {
	public static void main(String[] args) {
		TryCatchTest hello=new TryCatchTest();
		int result=hello.result();
		System.out.println("fangfazhixingwanbi,return:"+result);
		int res=hello.res();
		System.out.println("reszhingxingwangbi");
	}
	
	public int result(){
		int divider=10;
		int result=100;
		try{
			while(divider>-1){
				divider--;
				result=result+100/divider;
			}
			return result;
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("chengxuchuxianyichangla!!!");
			return -1;
		}
	}
	
	public int res(){
		int divider=10;
		int result=100;
		try{
			while(divider>-1){
				divider--;
				result=result+100/divider;
			}
			return result;
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("chengxuchuxianyichangla!!!");
			return result=999;
		}
		finally{
			System.out.println("zheishifinally!!!");
			System.out.println(result);
		}
	}
}
