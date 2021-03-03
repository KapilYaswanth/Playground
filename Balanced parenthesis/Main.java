#include <bits/stdc++.h>

using namespace std;

// Complete the isBalanced function below.
string isBalanced(string s) {
stack <char> st;
for(int i=0;i<s.length();i++)
{
    if(s[i]=='[' || s[i]=='(' || s[i]=='{')
    {
        st.push(s[i]);
        continue;
    }
    if(st.empty())
    {
        return "Not Balanced";
    }
    switch(s[i])
    {
        case ')':
        if(st.top()!='(')
        {
            return "Not Balanced";
        }
        else
        {
            st.pop();
        }
        break;
        case '}':
        if(st.top()!='{')
        {
            return "Not Balanced";
        }
        else
        {
            st.pop();
        }
        break;
        case ']':
        if(st.top()!='[')
        {
            return "Not Balanced";
        }
        else
        {
            st.pop();
        }
        break;
    }
}

return "Balanced";
}

int main()
{
        string s;
        getline(cin, s);

        string result = isBalanced(s);

        cout << result << "\n";

    return 0;
}
