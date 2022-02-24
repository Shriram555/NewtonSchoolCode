import java.util.Scanner;
class Array{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int [6];
		for(int i=0;i<6;i++){
			a[i]=sc.nextInt();	
		}
		for(int i=0;i<6;i++)
		{
			System.out.println(a[i]);
		}
	}
	
}