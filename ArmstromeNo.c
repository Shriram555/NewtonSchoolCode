#include <stdio.h>
int main(){
int n ,r;
printf("Enter the number\n ");
scanf("%d",&n);
while(n>0){
    r=n%;
    printf("%d",r);
    n/=10;
}

}

