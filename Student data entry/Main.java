#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   //Your code goes here
  student s;
  cin.get(s.name,50);
  cin>>s.roll>>s.marks;
  cout<<"\nStudent Details\n";
  cout<<"Name: "<<s.name<<endl;
  cout<<"Roll: "<<s.roll<<endl;
  cout<<"Marks: "<<s.marks<<endl;
  return 0;
}