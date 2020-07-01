#include<stdio.h>
int main()
{
  int n,m;
  scanf("%d",&n);
  scanf("%d",&m);
  if(n>m)
  {
    printf("%d is smallest number",m);
  }
  else
    printf("%d is smallest number",n);
  return 0;
}