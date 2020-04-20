#include<iostream>
#include<string>
using namespace std;
int main() 
{ /*std::string fnum;
  string str="";
  cin>>fnum;
  int i=0;
  while(fnum[i]!='\0')
  {
    if(fnum[i]=='.')
      break; 
    i++;
  }
  
  while(fnum[i]!='\0')
  {
    i++;
    str+=fnum[i];
  }
  str[i]='\0';
  cout<<"Floating part is : "<<str;*/
  //cout<<"Floating part is : 0";
  char fnum[50],str[50];
  str[0]='\0';
  cin>>fnum;
  int i=0;
  cout<<"Floating part is : ";
 while(fnum[i]!='\0')
  {
    if(fnum[i]=='.')
      break; 
    i++;
  }
  int j=0;
  while(fnum[i]!='\0')
  {
    i++;
    str[j]=fnum[i];
    j++;
  }
  cout<<str;
  
}