#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int arr[100];
  int n,max;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  max=arr[0];
  for(int i=0;i<n;i++)
  {
    
    if(arr[i]>=max)
    {
      max=arr[i];
    }
  }
  cout<<max;
  return 0;
}