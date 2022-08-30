#include<stdio.h>
int main()
{
    int cost ;
    float dis;
    char type;

    printf("Enter the   type\n");
    scanf("%c",&type);
     printf("Enter the cost \n");
    scanf("%d",&cost);

   if(type=='s')
     {
         if(cost>=500){
            dis=0.10*cost;
            cost=cost-dis;
            printf("dis cost=%d",cost);
         }else
         {
           dis=0.05*cost;
            cost=cost-dis;
            printf("dis cost=%d",cost);
         }
     }
    else{
        if(cost>=500){
            dis=0.08*cost;
            cost=cost-dis;
            printf("dis cost=%d",cost);
         }else
         {
           dis=0.02*cost;
            cost=cost-dis;
            printf("dis cost=%d",cost);
         }
    }


return 0;
}
