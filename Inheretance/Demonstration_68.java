abstract class Base{
   abstract void fun();
}
class Derived extends Base{
  void fun(){System.out.println("derived fun() is called ");
}}
class Demonstration_68{
public static void main (String args[])
{
//Base  b=new Base();
Derived c=new Derived();
c.fun();

}

}	
