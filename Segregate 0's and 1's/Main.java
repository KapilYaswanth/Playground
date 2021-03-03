#include <bits/stdc++.h>
using namespace std;

int main() 
{
  string s;
  int c=0;
  cin>>s;
  //cout<<s;
  for(int i=0;i<s.size();i++)
  {
    if(s[i]=='1')
      c=c+1;
  }
  for(int i=0;i<c;i++)
  {
    cout<<'1';
  }
  for(int i=c;i<s.size();i++)
  {
    cout<<'0';
  }
    return 0;
}