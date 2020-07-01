#include <stdio.h>
struct employee
{
char name[20];
int id;
int age;
char desig[15];
int sal;
};
struct employee e;
int main()
{
  printf("Enter name:\n");
  scanf("%s",&e.name);
  printf("Enter ID:\n");
  scanf("%d",&e.id);
  printf("Enter age:\n");
  scanf("%d",&e.age);
  printf("Enter designation:\n");
  scanf("%s",&e.desig);
  printf("Enter Salary:\n");
  scanf("%d",&e.sal);
  printf("Employee Details\n");
  printf("Name of the Employee : %s\nID of the Employee : %d\nAge of the Employee : %d\nDesignation of the Employee : %s\nSalary of the Employee : %d",e.name,e.id,e.age,e.desig,e.sal);
return 0;
}