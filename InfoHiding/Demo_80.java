class BaseClass{
	public int x=10;
	public int y=10;
	protected int z=10;
	int a=10;
	private int d=200;
	public int getX(){
		return x;
	}
	public void setX(int x){
		this.x=x;
	}
	public int getY(){
		return y;
	}
	protected void setY(int Y){
		this.y=y;
	}
	protected  int getZ(){
		return z;
	}
	protected void setZ(int z){
		this.z=z;
	}
	int getA(){
		return a;
	}
	void setA(int a){
		this.a=a;
	}
}
public class Demo_80 extends BaseClass{
   public static void main(String args[]){
	   BaseClass rr=new BaseClass();
	   rr.z=0;
	   //System.out.println(rr.z);
	   Demo_80 subClassObj=new Demo_80();
	   
	   System.out.println(subClassObj.d);
	 /*  subClassObj.setX(20);
	   	   System.out.println("Value of x is :"+subClassObj.x);

	   System.out.println("Value of x is :"+subClassObj.z);
subClassObj.setZ(30);
	   System.out.println("Value of x is :"+subClassObj.z);

	   System.out.println("Value of x is :"+subClassObj.a);
subClassObj.setA(20);
	   System.out.println("Value of x is :"+subClassObj.a);*/
   }
	}