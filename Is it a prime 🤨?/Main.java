#include<iostream>
using namespace std;
int main()
{
 int n,f=1;
  cin>>n;
  if (n==1 || n==0)
  {
    f=0;
  }
  for(int i=2;i<n;i++)
  {
    if(n%i==0)
    {
      f=0;
    }
  }
  if(f==1)
    cout<<"Prime";
  else
    cout<<"Not Prime";
return 0;
}