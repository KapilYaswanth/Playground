#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int a[50][50];
  int b[50][50];
  int r,c;
  cin>>r>>c;
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      std::cin>>a[i][j];
    }
  }
    for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      std::cin>>b[i][j];
    }
  }
    for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      std::cout<<a[i][j]+b[i][j]<<" ";
    }
      std::cout<<"\n";
  }
  return 0;
}