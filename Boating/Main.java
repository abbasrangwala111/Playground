#include<stdio.h>
int main()
{
  int a,b,c,m,n,z;
  int x=75;
  int y=30;
  scanf("%d",&a);
  scanf("%d",&b);
  scanf("%d",&c);
  m=x*b;
  n=y*c;
  z=m+n;
  if(z<a)
  {
    printf("Boat is stable");
  }
  else
  {
    printf("Boat will drow");
  }
  return 0;
}
  
  