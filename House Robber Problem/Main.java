#include<iostream>
using namespace std;
int main()
{
   int n;
   cin>>n;
 int a[n],b[n];
  for(int i=0;i<n;i++)
  {
      cin>>a[i];
  }
  b[0]=a[0];
  b[1]=max(a[0],a[1]);
for(int i=2;i<n;i++)
{
    if(a[i]+b[i-2]>b[i-1])
    {
        b[i]=a[i]+b[i-2];
    }
    else
    {
        b[i]=b[i-1];
    }
}
 cout<<b[n-1]; 
  return 0;
}