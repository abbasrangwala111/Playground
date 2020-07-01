#include <iostream>
#include<cstring>
using namespace std;
struct student
{
char name[50];
int roll;
float marks;
};
int main()
{
struct student s;
cin.get(s.name, 50);
std::cin>>s.roll;
std::cin>>s.marks;
std::cout<<endl<<"Student Details"<<endl;
std::cout<<"Name: "<<s.name<<endl;
std::cout<<"Roll: "<<s.roll<<endl;
std::cout<<"Marks: "<<s.marks<<endl;
return 0;
}