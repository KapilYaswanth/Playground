#include<iostream>
using namespace std;
int main()
{
  //Type your code here
  int a,b,c;
  int key[4]={0};
  cin>>a>>b>>c;
  if(a>=1000 && b>=1000 && c>=1000 && a<=9999 && b<=9999 && c<=9999)
  {
      if(a%10 > b%10 && a%10 > c %10)
      {
        key[0]=a%10;
      }
      else if(b%10>c%10)
      {
          key[0]=b%10;
      }
      else
      {
          key[0]=c%10;
      }
      if((a/10)%10 < (b/10)%10 && (a/10)%10 < (c/10)%10)
      {
        key[1]=(a/10)%10;
      }
      else if((b/10)%10<(c/10)%10)
      {
          key[1]=(b/10)%10;
      }
      else
      {
          key[1]=(c/10)%10;
      }
      if((a/100)%10 > (b/100)%10 && (a/100)%10 > (c/100)%10)
      {
        key[2]=(a/100)%10;
      }
      else if(b%10>c%10)
      {
          key[2]=(b/100)%10;
      }
      else
      {
          key[2]=(c/100)%10;
      }
      if(a/1000 < b/1000 && a/1000 < c/1000)
      {
        key[3]=a/1000;
      }
      else if(b/1000<c/1000)
      {
          key[3]=b/1000;
      }
      else
      {
          key[3]=c/1000;
      }
  }
  cout<<key[3]<<key[2]<<key[1]<<key[0];
  return 0;
}