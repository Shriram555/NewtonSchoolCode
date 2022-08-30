#include <stdio.h>
int main()
{
    int n1 = 0, n2 = 1, n3, num;
    printf("Enter the number");
    // scanf("%d",&num);
    int fact = factorial(5);
    printf("%d", fact);
}
int factorial(int n)
{

    if (n >= 1)
    {
        return n + factorial(n - 1); // 4//
    }
    else
        return 1;
}
