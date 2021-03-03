#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  // Type your code here
  int arr[100];
  int n,k;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  cin>>k;
  for(int i=0;i<n;i++)
  {
    if(k==arr[i])
    {
      cout<<"She passed her exam";
      exit(0);
    }
      
  }
  cout<<"She failed";
  return 0;
}