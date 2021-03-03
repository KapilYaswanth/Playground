#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here
  int n,r,s=0,ct=0;
  cin>>n;
  int t=n;
int f=n;
  while(t!=0)
  {
    ct=ct+1;
    t=t/10;
  }
  while(n!=0)
  {
    r=n%10;
    s=s+pow(r,ct);
    n=n/10;
  }
  if(s==f)
    cout<<"Yes";
  else
    cout<<"No";
  return 0;
}