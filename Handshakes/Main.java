#include<stdio.h>
int main()
{
  int n,sum=0;
  scanf("%d",&n);
  for(int i=0;i<n;++i)
  {
    sum=sum+i;
    //printf("\n%d",sum);
  }
  printf("%d",sum);
  return 0;
}