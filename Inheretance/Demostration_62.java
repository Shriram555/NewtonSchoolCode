class Box {
double width;
double height;
double depth;

Box(){
width=0.0;
height=0.0;
depth=0.0;
}
Box(double w,double h,double d){
width =w;
height =h;
depth =d;
}
double volume(){
return width*height*depth;
}
}

class BoxWeight extends Box {
double weight;

BoxWeight(double w,double h, double d, double m){
super(w,h,d);
weight=m;
}
}
class Demostration_62{
public static void main(String args[])
{
Box mybox1=new Box();
BoxWeight mybox2=new BoxWeight(2,4,5,0.015);
double vol;
vol=mybox1.volume();
System.out.println("volume is :- "+vol);
System.out.println();

vol=mybox2.volume();
System.out.println("volume of mybox2 is"+vol );
 	System.out.println("weight  of mybox2= is"+mybox2.weight );
}
}