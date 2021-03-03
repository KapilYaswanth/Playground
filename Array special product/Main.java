#include <iostream>
using namespace std;
int main()
{
    int n,s=1;
    cin>>n;
    int a[n];
    int b[n];
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    for(int i=0;i<n;i++)
    {
        s=s*a[i];
    }
    
for(int i=0;i<n;i++)
    {
        cout<<s/a[i]<<"\n";
    }
    return 0;
}
