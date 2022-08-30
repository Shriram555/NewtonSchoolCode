#include<stdio.h>
int main(){
int i,n, sum=0;
printf("Enter the number\n");
scanf("%d",&n);
for( i=1;i<n;i++){
    if(n%i==0){
        sum+=i;
    }
}
if(sum==n){
    printf("Number is perfect");
}else{

    printf("Number  not  is perfect");
}
return 0;
}
