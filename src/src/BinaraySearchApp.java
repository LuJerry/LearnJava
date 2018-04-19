//zhe ban cha zhao
public class BinaraySearchApp {
	public static void main(String[] args) {
		int mid,low,high;
		int[] arr={8,13,21,28,35,41,52,63,71,76,81,95,101,150,164};
		low=0;
		high=arr.length-1;
		int x=Integer.parseInt(args[0]);
		do{
			mid=(low+high)/2;
			if(x==arr[mid]){
				System.out.println(x+"success,zai"+mid+"weizhi");
				return;
			}
			else if(x<arr[mid]){
				high=mid-1;
			}
			else{
				high=mid+1;
			}
		}while(low<high);
		System.out.println(x+"faile");
	}
}
