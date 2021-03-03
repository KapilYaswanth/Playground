#include<iostream>
using namespace std;
int main()
{
  long long int n;
  cin>>n;
  if(n>0)
  {
    cout<<(n*(n+1))/2;
  }
  else
  {
    cout<<"0";
  }
  return 0;
}