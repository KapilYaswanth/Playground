#include<bits/stdc++.h>
using namespace std;
int main()
{
  vector <int> v;
  int n;
  cin>>n;
  for(int i=1;i<=sqrt(n);i++)
  {
    if(n%i==0)
    {
      v.push_back(i);
      v.push_back(n/i);
    }
  }
  sort(v.begin(),v.end());
  v.erase(unique(v.begin(),v.end()),v.end());
  for(int i=0;i<v.size();i++)
  {
    cout<<v[i]<<" ";
  }
  return 0;
}
