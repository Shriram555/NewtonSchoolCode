import java.util.Scanner; 
class Recursion1 {
   static void printArray(int arr[],int size){
   for(int i=0;i<=size;i++){

   System.out.println(arr[i]);
   }
   }
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array");
      int size=sc.nextInt();
      int arr[]=new int [size];
      for (int i=0;i<size;i++){
          System.out.println("Enter the array:"+i);
         arr[i]=sc.nextInt();
         
      }
      for(int i=0;i<=size;i++);{
       printArray(arr[],size);
      }
   }
}
   

    