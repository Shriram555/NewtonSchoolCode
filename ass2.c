#include <stdio.h>
int main(){
int a,b,c,max1;
printf("enter the three number\n");
scanf("%d%d%d",&a,&b,&c);
max1=(a>b)?a:b;
max1=(c>max1)?c:max1;
printf("maximum=%d",max1);
return (0);
}
