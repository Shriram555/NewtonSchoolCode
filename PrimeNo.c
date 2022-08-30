#include<stdio.h>
int main(){
int i,n;
printf("Enter the number\n");
scanf("%d",&n);
for( i=2;i<n;i++){
    if(n%i==0){
        break;
    }
}
if(i==n){
    printf("Number is prime");
}else{

    printf("Number  not  is prime");
}
return 0;
}
