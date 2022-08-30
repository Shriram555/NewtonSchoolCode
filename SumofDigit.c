#include <stdio.h>
int main(){
int n,r,sum=0;
printf("Enter the num \n");
scanf("%d",&n);
int num=n;
while(n>0){
    r=n%10;
    sum=sum+(r*r*r);
    n/=10;
}
if(num==sum){
    printf("this is armstrome number");
}else{
printf("not armstrome");
}
return 0;
}

