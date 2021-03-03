#include<iostream>
using namespace std;
int main()
{
  int n,s=0;
  cin>>n;
  int temp =n;
  for(int i=1;i<n;i++)
  {
    if(n%i==0)
      s=s+i;
  }
  if(s==temp)
  {
    cout<<"Yes";
  }
  else if(s!=temp)
  {
    cout<<"No";
  }
  return 0;
}