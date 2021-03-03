#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int a[50][50];
  int r,c;
  std::cin>>r>>c;
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      std::cin>>a[i][j];
    }
  }
  for(int i=0;i<c;i++)
  {
    for(int j=0;j<r;j++)
    {
      std::cout<<a[j][i]<<" ";
    }
    std::cout<<"\n";
  }
  
      return 0;
}