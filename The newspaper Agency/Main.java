#include<stdio.h>
int main()
{
  int w,x,y,profit;
  scanf("%d",&w);
  scanf("%d",&x);
  scanf("%d",&y);
  profit = w*x-(100+w*y);
  printf("%d",profit);
  return 0;
  
}