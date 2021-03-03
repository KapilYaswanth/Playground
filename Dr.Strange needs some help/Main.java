#include<iostream>
#include <bits/stdc++.h>
using namespace std;
int main()
{
  int m,n,req;
  cin>>m>>n>>req;
  if(pow(m,n)>=req)
  {
    cout<<"Doctor, you can proceed with your experiment.";
  }
  else if(pow(m,n)<req)
  {
    cout<<"Sorry Doctor! You need more bacteria.";
  }
  return 0;
}
    
  