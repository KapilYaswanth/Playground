#include <iostream>
using namespace std;

int main() 
{
   string s;
  int ct=1;
  getline(cin,s);
  int l=s.size();
  for(int i=0;i<l;i++)
  {
    if(s[i]==' ')
    {
      ct=ct+1;
    }
  }
  if(ct>10)
  {
     cout<<"Caption not eligible for the contest"; 
  }
  else
  {
      cout<<"Caption eligible for the contest";
  }
    return 0;
}