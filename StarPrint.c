#include<stdio.h>
int main(){
int i,n,j,k;
printf("Enter the number\n");
scanf("%d",&n);
for( i=1;i<=n;i++){
   for (j=1;j<=i-1;j++){
    printf(" ");
   }
    for (j=1;j<=n-i;j++){
    printf("*");
   }
   for (k=1;k<=n-i-1;k++){
    printf("*");
   }

   printf("\n");
    }


return 0;
}

