#include<iostream>
using namespace std;
int s=0;
int SumNumbersDivisible(int m,int n)
{ 
  if(m<n)
  {
      if(m%3==0 && m%5==0)
      {
      s=s+m;
      m=m+1;
      SumNumbersDivisible(m,n);
      }
      else
      {
          m=m+1;
          SumNumbersDivisible(m,n);
      }
  }
  cout<<s;
  exit(1);
}
int main()
{
  int m,n;
  cin>>m>>n;
  SumNumbersDivisible(m,n);
  return 0;
}