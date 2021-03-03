#include<iostream>
using namespace std;
int main()
{
    int a,b,c,gcd1,res,ans;
    std::cin>>a>>b>>c>>ans;
   //Your code goes here
  if(a<b && a<c)
  	res=a;
  else if(b<a && b<c)
  	res=b;
  else
    res=c;
  if(a%res==0 && b%res==0 && c%res==0)
  {
    gcd1=res;
  }
  if(gcd1==ans)
  {
    cout<<"Answer is correct.";
}
  else
  {
    cout<<"Answer is wrong.";
  }
  return 0;
}