#include<iostream>
using namespace std;
struct complex
{
  int choice;
  int a;
  int b;
};
void add(complex,complex);
void sub(complex,complex);
void mul(complex,complex);
int main()
{
  complex c,c1,c2;
  cin>>c.choice>>c1.a>>c1.b>>c2.a>>c2.b;
  if(c.choice==1)
  	add(c1,c2);
  else if(c.choice==2)
    sub(c1,c2);
  else if(c.choice==3)
    mul(c1,c2);
  else
    cout<<"Invalid choice";
  return 0;
}
void add(complex c1,complex c2){
    int addreal=c1.a+c2.a;
    int addimg=c1.b+c2.b;
    if(addimg>0)
    {
      cout<<addreal<<"+"<<addimg<<"i";
    }
    else
    {
      cout<<addreal<<addimg<<"i";
    }
  }
  void sub(complex c1,complex c2){
    int subreal=c1.a-c2.a;
    int subimg=c1.b-c2.b;
    if(subimg>0)
    {
      cout<<subreal<<"+"<<subimg<<"i";
    }
    else
    {
      cout<<subreal<<subimg<<"i";
    }
  }
  void mul(complex c1,complex c2){
      cout<<(c1.a*c2.a)-(c1.b*c2.b)<<(c1.b*c2.b)+(c1.a*c2.b)<<"i";
  }