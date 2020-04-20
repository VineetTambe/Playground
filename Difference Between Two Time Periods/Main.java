#include<iostream>
using namespace std;
struct time
{
  int hour,min,sec;
  void get()
  {
    cin>>hour>>min>>sec;
  }
  void show()
  {
    cout<<hour<<":"<<min<<":"<<sec;
  }
};

int main()
{
  //Type your code here.
  struct time t1,t2;
  
  t1.get();
  t2.get();
  if(t1.sec>t2.sec)
    t1.sec = t1.sec-t2.sec;
  else
  {
    t1.sec = 60+t1.sec-t2.sec;
    t1.min--;
  }
  
  if(t1.min>t2.min)
    t1.min = t1.min-t2.min;
  else
  {
    t1.min = 60+t1.min-t2.min;
    t1.hour--;
  }
  t1.hour = t1.hour-t2.hour;
  if(t1.sec==60)
  {
    t1.sec=0;
    t1.min++;
  }
  if(t1.min>=60)
  {
    t1.min-=60;
    t1.hour++;
  }
  t1.show();
}