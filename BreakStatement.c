#include<stdio.h>
int main(){
int i,n;
printf("Enter the number\n");
scanf("%d",&n);
for( i=1;i<n;i++){
    if(i%3==0){
        continue;
    }else {
    printf("%d\n",i);
    }
}

return 0;
}

