import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		 
    Scanner sc= new Scanner(System.in);
    int testCases= sc.nextInt();
   
    while(testCases!=0)
    {
     
     int a= sc.nextInt();
     int b= sc.nextInt();
      int c= sc.nextInt();
	  
    
   
     
     
    int ans= expo(a, b, c);
      ans =expo( ans ,c,0);
     
    
        
        System.out.println(ans);
        testCases--;
    }
    
    }
    public static int expo( int a , int b, int c)
     {
       long mod=1000000007;
       int base = a , pow=b;
      int result= 1;
       for(pow=b; pow!=0;pow--)
       {
          result=result*(base);
       
       
	   }
     return result;
        

	}
}
