#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here
  long long int n,r,o=0,e=0,c=0;
  cin>>n;
  /*if(n<=0)
    cout<<"0";*/
  int temp=n;
  while(temp!=0)
  {
    c=c+1;
    temp=temp/10;
  }
    for(int i=c;i>=1;i--)
    {
    r=n%10;
    if(i%2==0)
      e=e+r;
    else
      o=o+r;
    n=n/10;
    }
  cout<<abs(o-e);
  return 0;
}