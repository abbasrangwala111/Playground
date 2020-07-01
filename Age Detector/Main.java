#include<stdio.h>
int main()
{
  int x,y,n,m;
  scanf("%d",&x);
  scanf("%d",&y);
  if(x>y)
  {
    x=x+1900;
    y=y+2000;
    n=y-x;
    printf("%d",n);
  }
  else
  {
    x=x+2000;
    y=y+2000;
    m=y-x;
    printf("%d",m);
  }
  return 0;
}
    
    
  
  
  