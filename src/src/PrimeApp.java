//程序5-1:求解100以内的全部素数
public class PrimeApp {
	public static void main(String[] args) {
		int m,n;
		int temp=0;
		System.out.println("100以内的素数有:");
		A:for(m=2;m<=100;m++){
			for(n=2;n<m/2;n++){
				if(m%n==0){
					continue A;
				}
				System.out.println(m);
			}
		}
	}	
}
