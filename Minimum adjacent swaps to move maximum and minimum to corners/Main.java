#include<iostream>
using namespace std;

int main()
{
  //Type your code here
  int size,max=0,min=0;
  cin>>size;
  int a[size];
  for(int i=0;i<size;i++)
  {
    cin>>a[i];
  }
  for(int i=0;i<size;i++)
  {
    if(a[i]>a[max])
      max=i;
    if(a[i]<a[min])
      min=i;
  }
  if (min < max) 
        cout << max + (size - min - 2); 
    else
        cout << max + (size - min - 1);
  return 0;
}