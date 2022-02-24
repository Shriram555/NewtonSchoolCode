class Cat{
void speak(){
System.out.println("me0w:");

}
}


class PetCat extends Cat{
void speak(){
System.out.println("meoow");
}
}



class MagicCat extends Cat{
static boolean noOne;
void speak(){
if (noOne){
super.speak();
}else{
System.out.println("hello World");
}
}
}

class Demonstration_66{
public static void main(String args[]){
PetCat c1=new PetCat();
MagicCat c2=new MagicCat();
c2.noOne=true;
c2.speak();
c1.speak();
c2.noOne=false;
c2.speak();
}
} 