#include<iostream>
using namespace std;
int arr[1000];
int top=-1;
void push(int s)
{
  for(int i=0;i<s;i++)
  {
    int n;
    cin>>n;
    top+=1;
    arr[top]=n;
  }
}
void display(int n,int st,int end)
{
    cout<<"Stack "<<n<<" Elements:\n";
    for(int i=st;i>=end;i--)
    {
        cout<<arr[i]<<" ";
    }
  cout<<"\n";
}
void pop(int p,int n,int s1,int s2)
{
    if(p>(s1+1)-s2)
    {
      cout<<"Stack underflow. pop from stack "<<n<<" failed";
      cout<<"\nStack "<<n<<" Elements:\n";
      cout<<"\n";
    }
    else
    {
        display(n,s1-p,s2);
    }
}
int main()
{
  int size1,size2,p1,p2;
  cin>>size1;
  push(size1);
  cin>>size2;
  push(size2);
  display(1,size1-1,0);
  display(2,top,size1);
  cin>>p1>>p2;
  pop(p1,1,size1-1,0);
  pop(p2,2,top,size1);
  return 0;
}