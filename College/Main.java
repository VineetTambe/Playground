#include<iostream>
using namespace std;

typedef struct college
{
  char name[50];
  char city[50];
  int year;
  float per;
  void get()
  {
    cout<<"Enter name"<<endl;
    cin>>name;
    cout<<"Enter city"<<endl;
    cin>>city;
    cout<<"Enter year of establishment"<<endl;
    cin>>year;
    cout<<"Enter pass percentage"<<endl;
    cin>>per;
  }
  void show()
  {
    cout<<"Name:"<<name<<endl;
    cout<<"City:"<<city<<endl;
    cout<<"Year of establishment:"<<year<<endl;
    cout<<"Pass percentage:"<<per<<endl;
  }
};

int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of colleges\n";
  cin>>n;
  college col[n];
  for(int i=0;i<n;i++)
  {
    cout<<"Enter the details of college "<<i+1<<endl;;
    col[i].get();
  }
  cout<<"Details of colleges\n";
  for(int i=0;i<n;i++)
  {
    cout<<"College:"<<i+1<<endl;
    col[i].show();
  }
}