#include<iostream>
using namespace std;
int sumMid(int mid)
{
  int s=0;
  while(mid!=0)
  {
    s=s+(mid%10);
    mid=mid/10;
  }
  return s;
}
int specificDifference(int N,int D)
{
    int c=0;
  for(int i=1;i<=N;i++)
  {
      if(i-sumMid(i)>=D)
      {
          c=c+1;
      }
  }
  return c;
}
int main()
{
  int N,D;
  cin>>N>>D;
  cout<<specificDifference(N,D);
  return 0;
}