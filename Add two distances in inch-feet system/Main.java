#include<iostream>
using namespace std;
struct dimension
{
  int feet;
  float inches;
  void get()
  {
    cin>>feet>>inches;
  }
  void update()
  {
    if(inches>12)
  	{
    	inches-=12;
    	feet+=1;
  	}
  }
  void show()
  {
    cout<<feet<<"'-"<<inches<<"\"";
  }
};
int main()
{
  //Type your code here.
  struct dimension D[2];
  D[0].get();
  D[1].get();
  D[0].feet += D[1].feet;
  D[0].inches += D[1].inches;
  D[0].update();
  D[0].show();
}