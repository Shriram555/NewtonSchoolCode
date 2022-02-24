class A{
void A(){
System.out.println("this is class A");
}}
class B {
void B(){
A();
System.out.println("This is class B");
}}
class Demo{
public static void main (String args[])
{
B s=new B();
s.B();
}}

