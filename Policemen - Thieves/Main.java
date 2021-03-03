#include<iostream>
using namespace std;
int main()
{
  //Type your code here
  int n,c=0,t=0;
  cin>>n;
  char a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(int i=0;i<n;i++)
  {
    if(a[i]=='P')
    {
      c=c+1;
    }
    if(a[i]=='T')
    {
      t=t+1;
    }
  }
  if(t<c)
  {
  cout<<"Maximum thieves caught: "<<t;
  }
  else
  {
    cout<<"Maximum thieves caught: "<<c;
  }
  return 0;
}