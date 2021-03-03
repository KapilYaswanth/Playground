#include<iostream>
using namespace std;
void sum(int n)
  {
  int r,s=0;
  while(n!=0)
  {
    r=n%10;
    s=s+r;
    n=n/10;
  }
  if(s>9)
  {
    sum(s);
  }
  else
  {
    cout<<s;
  }
  }
int main()
{
  int n;
  
  cin>>n;
  sum(n);
  
    return 0;
}
