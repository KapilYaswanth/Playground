#include<iostream>
using namespace std;
int main()
{
  int a,b;
  int s;
  cin>>a>>b;
  if(a<b)
  {
    s=a;
  }
  else if(b<a)
  {
    s=b;
  }
  while(s>0)
  {
    if(a%s==0 && b%s==0)
    {
      cout<<s;
      break;
    }
    s=s-1;
  }
  return 0;
}