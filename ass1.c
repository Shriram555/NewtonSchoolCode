#include <stdio.h>
int main(){
float amt,p,r,ins;
printf("Enter the amount ");
scanf("%f",&amt);
printf("Enter the  period");
scanf("%f",&p);
printf("Enter the rate");
scanf("%f",&r);
ins=amt*p*r;
printf("simple interest=%f",ins);
return 0;
}
