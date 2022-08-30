#include <stdio.h>
int main(){
int n ,r;
printf("Enter the num ");
scanf("%d",&n);
while(n>0){
    r=n%10;
    printf("%d",r);
    n/=10;
}

}
