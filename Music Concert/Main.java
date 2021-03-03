#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  // Type your code here
  int *a;
  int n,o=0;
  int e=0;
  cin>>n;
  a=(int*) malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    cin>>*(a+i);
  }
  for(int i=0;i<n;i++)
  {
    if(*(a+i)%2==0)
    	e=e+1;
    else
      o=o+1;
  }
  cout<<o<<"\n"<<e;
  
  
  return 0;
}