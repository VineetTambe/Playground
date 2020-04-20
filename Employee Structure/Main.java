#include<iostream>
using namespace std;

typedef struct employee
{
  char name[50];
  int id;
  int age;
  char des[50];
  float sal;
  void get()
  {
    cout<<"Enter name:"<<endl;
    cin>>name;
    cout<<"Enter ID:"<<endl;
    cin>>id;
    cout<<"Enter age:"<<endl;
    cin>>age;
    cout<<"Enter designation:"<<endl;
    cin>>des;
    cout<<"Enter Salary:"<<endl;
    cin>>sal;
  }
  void show()
  {
    cout<<"Employee Details"<<endl;
    cout<<"Name of the Employee : "<<name<<endl;
    cout<<"ID of the Employee : "<<id<<endl;
    cout<<"Age of the Employee : "<<age<<endl;
    cout<<"Designation of the Employee : "<<des<<endl;
    cout<<"Salary of the Employee : "<<sal<<endl;
  }
};

int main()
{
  //Type your code here.
  employee emp;
  emp.get();
  emp.show();
 
}