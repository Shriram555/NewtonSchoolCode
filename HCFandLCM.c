#include <stdio.h>
int main(){
int a,b,hcf,lcm,p;
printf("Enter the Two Number \n");
scanf("%d%d",&a,&b);
p=a*b;
while(a!=b){
    if(a>b){
        a=a-b;
    }else
    {
        b=b-a;
    }
}
hcf=a;
lcm=p/a;
printf("gcd=%d\n",hcf);
printf("lcm=%d\n",lcm);
return 0;
}
