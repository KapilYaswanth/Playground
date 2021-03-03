#include<bits/stdc++.h>
#include<iostream>
using namespace std;
string isredundant(string s)
{
 stack <char> st;
 bool a=true;
  for(int i=0;i<s.length();i++)
  {
    if(s[i]==')')
    {
        if(st.top()=='(')
        {
            return "Yes";
        }
        else
        {
        while(st.top()!='(')
        {
            if((st.top()=='+'|| st.top()=='-'|| st.top()=='*'|| st.top()=='/'))
            {
                a=false;
            }
            st.pop();
        }
        st.pop();
        if(a==true)
        {
            return "Yes";
        }
        }
    }
    else
    {
      st.push(s[i]);
    }
  }
  return "No";
}
int main()
{
  string s;
  getline(cin,s);
  cout<<isredundant(s);
  return 0;
}