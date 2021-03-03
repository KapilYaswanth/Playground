#include<iostream>
#include<bits/stdc++.h>
using namespace std;
string rev(string);
stack<char> stk;
int precedence(char a)
{
  if(a=='+' || a=='-')
    return 1;
  if(a=='*' || a=='/')
    return 2;
  else
    return 0;
}
void postfix(string a)
{
  string ns1;
  for(int i=0;i<a.length();i++)
  {
    if(a[i]=='(')
    {
      stk.push(a[i]);
    }
    else if(a[i]==')')
    {
      while(stk.top() != '(')
      {
        ns1+=stk.top();
        stk.pop();
      }
      stk.pop();
    }
    else if(a[i]>=40 && a[i]<=47)
    {
      while(!stk.empty() && precedence(stk.top()) >= precedence(a[i]))
      {
        ns1+=stk.top();
        stk.pop();
      }
      stk.push(a[i]);
    }
    else
      ns1+=a[i]; 
  }
  while(!stk.empty())
  {
      ns1+=stk.top();
      stk.pop();
  }
  cout<<rev(ns1);
}
string rev(string s)
{
  string rs;
  for(int i=s.length()-1;i>=0;i--)
 {
   if(s[i]=='(')
     rs+=')';
   else if(s[i]==')')
     rs+='(';
   else
   rs+=s[i];
 }
  return rs;
}
int main()
{
  //Type your code here
  string st,ns;
  getline(cin,st);
 ns=rev(st);
  postfix(ns);
  return 0;
}