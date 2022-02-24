class A{
	protected int rollNo=555;
	protected void msg(){
		System.out.println("Class A: Hello "+ rollNo)
	}
}
class Demo_79{
	public static void main (String args[]){
		A obj=new A();
		obj.msg();
		obj.rollNo();
	}