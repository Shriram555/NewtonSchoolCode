class A{
int i,j;
void showij(){
System.out.println("i and j "+i+"  "+j);
}
}
class B extends A{
int k;
void showk(){
System.out.println("k"+" "+k);
}
void sum(){
System.out.println("i+j+k"+"="+(i+j+k));
}
}  

class Demostration_61{
public static void main (String args[]){
A superOb=new A();
B subOb=new B();
superOb.i=10;
superOb.j=20;
System.out.println("content of super object");
superOb.showij();

subOb.i=7;
subOb.j=8;
subOb.k=9;
System.out.println("contents of subOb");
subOb.showij();
subOb.showk();
System.out.println();
System.out.println("sum of i, j and k is subOb:");
subOb.sum();

} 
} 