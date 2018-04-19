//di gui fa qiu jie chen
public class Recurrence {
	static int func(int n){
		if(n==1){
			return 1;
		}
		else{
			return n*func(n-1);
		}
	}
	public static void main(String[]args){
		int res=func(15);
		System.out.println(res);
	}
}
