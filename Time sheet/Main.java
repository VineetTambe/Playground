#include<iostream>
using namespace std;
int main()
{
  int days[7],tot=0,tr=0;
  int r[7];
  int n=7;
  for(int i=0;i<n;i++)
  {
    cin>>days[i];
  }
  r[0]=days[0]*150;
  r[6]=days[6]*125;
  for(int i=1;i<n-1;i++)
  {
    if(days[i]>8)
    {
      r[i]=((days[i]-8)*100)+ (days[i]-8)*15 +800;
    }
    else
    {
      r[i]=days[i]*100;
    }
    tot+=days[i];
  }
  
  if(tot>40)
  {
    tr = (tot-40)*125;
  }
  
  for(int i=0;i<n;i++)
  {
    tr+=r[i];
  }
 cout<<tr;
  
  
}