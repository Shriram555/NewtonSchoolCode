//import java.lang.*;
class Calculate{
	double i;
	double x;
	void p(){
		x=Math.sqrt(i);
	}
}
class Demo81{
public static void main(String args[]){
	Calculate s=new Calculate();
	s.i=20;
	s.p();
	System.out.println(s.x);
}
}