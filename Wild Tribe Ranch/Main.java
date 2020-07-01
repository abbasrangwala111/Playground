#include<iostream>
int main()
{
  int b,c;
  std::cin>>b;
  std::cin>>c;
  if(b>c)
    std::cout<<"Yes, you can enter.";
  else if(b==c)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else
    std::cout<<"Sorry, you can't enter";
}