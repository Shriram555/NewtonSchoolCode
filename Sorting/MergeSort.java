
public class Array{
	static int powRec(int a, int b){
		if(b==0) return 2;
		
		if(b%2==0){
			return powRec(a, b/2)*powRec(a, b/2);
		}else{
	      return a*powRec(a, b/2)*powRec(a, b/2);
		}
	}
public static void main(String args[]){
  int a=2;
  int b=10;
  System.out.println(powRec(a,b));
}
}