
#include <iostream>
#include <stack>
using namespace std;
int findMaxLen(string str)
{
    stack<int> stack;
    stack.push(-1);
    int max = 0;
    for (int i = 0; i < str.length(); i++)
    {
        if (str[i] == '(') {
            stack.push(i);
        }
        else {
            stack.pop();
            if (stack.empty())
            {
                stack.push(i);
                continue;
            }
            if (max < i-stack.top()) {
                max = i-stack.top();
            }
        }
    }
    return max;
}
int main()
{
  	string s;
  	getline(cin,s);
    cout << findMaxLen(s) << endl;       // prints 4
    return 0;
}