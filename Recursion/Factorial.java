import java.util.Scanner; 
class Factorial {
   public static void main (String args[]){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the size of array");
	   int size=sc.nextInt();
	   int arr[]=new int[size];
	   for (int i=0;i<=size;i++){
		   arr[i]=sc.nextInt();
	   }
	   
	   System.out.println("    ");
   for(int i=0;i<=size;i++){
		   System.out.println(arr[i]);
	   }
   }
    }