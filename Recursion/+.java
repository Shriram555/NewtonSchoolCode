import java.util.*;
class SearchingArray{
	public static void main (String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of Array");
	int size=sc.nextInt();
	System.out.println("Enter thye array ");
	int arr[]=new int[size];
for (int i=0;i<arr.length;i++){
	int arr[i]=sc.nextInt();
        }	
	Sytem.out.println("Enter the target ");
	int target= sc.nextInt();
	int n =arr.length;
	int low=0;
	int high = n-1;
	int ans = -1;
	while (high>=low){
		int mid = (low+high)/2;
		if(arr[mid]==target){
			ans=mid;
			break;
		}
	      if(arr[mid]<target){
			  low=mid+1;
		  }else {
			  high=mid-1;
		  }
	}
	System.out.println(ans);
	}
}