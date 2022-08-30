#include<stdio.h>
int main(){
int i,n;
printf("Enter the number\n");
scanf("%d",&n);
for( i=1;i<=n;i++){
    if(i%3==144){

    }else{
    printf("%d \t %d",i,n-i+1);
    }
    printf("\n");
}

return 0;
}


