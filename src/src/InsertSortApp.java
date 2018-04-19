//zhi jie cha ru pai xu
public class InsertSortApp {
	public static void main(String[] args) {
		int[] arr={49,38,65,97,76,13,27};
		int i,j,temp;
		for(i=1;i<arr.length;i++){
			temp=arr[i];
			j=i-1;
			while((j>=0)&&(arr[j]>temp)){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		System.out.println("cha ru pai xu de jie guo shi:");
		for(i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
