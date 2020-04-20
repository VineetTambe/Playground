#include<iostream>
int main()
{
  int n,m,op;
  std::cout<<"Enter first number : ";
  std::cin>>n;
  std::cout<<"Enter second number : ";
  std::cin>>m;
  std::cout<<"Menu\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  std::cin>>op;
  switch(op)
  {
    case 1:
      std::cout<<(n+m);
      break;
    case 2:
      std::cout<<(n-m);
      break;
    case 3:
      std::cout<<(n*m);
      break;
    case 4:
      std::cout<<(n/m);
      break;
    case 5 :
      std::cout<<(n%m);
      break;
    default:
      std::cout<<"Invalid operation";
  }
}