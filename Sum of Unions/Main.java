#include<iostream>
using namespace std;
int main()
{
  //Type your code here
  int a[25][25];
  int m,n,x,y;
  int rs=0;
  int cs=0;
  cin>>m>>n;
  for(int i=0;i<m;i++)
  	for(int j=0;j<n;j++)
      cin>>a[i][j];
  cin>>x>>y;
  for(int i=x;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      rs=rs+a[i][j];
    }break;
  }
  for(int j=y;j<n;j++)
  {
    for(int i=0;i<m;i++)
    {
      if(i==x)
      {
        continue;
      }
      cs=cs+a[i][j];
    }break;
  }
 cout<<rs+cs;
return 0;
}
