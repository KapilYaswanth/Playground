#include <iostream>
using namespace std;
void fact(int a)
  {
    int f=1;
    for(int i=1;i<=a;i++)
  {
     f=f*i;
  }
  cout<<"The factorial of "<<a<<" is "<<f;
  }
int main() 
{
   // Try out your code here
  int n;
  cin>>n;
    if(n>=1)
    {
  fact(n);
    }
  else{
  
  }
    return 0;
}