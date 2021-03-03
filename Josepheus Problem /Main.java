#include <iostream> 
using namespace std; 
int josephus(int n, int k) 
{ 
    	int s=1;
  		for(int i=1;i<=n;i++)
        {
          s=(s+(k-1))%i+1;
        }
        return s; 
} 
int main() 
{ 
    int n,k;
  cin>>n>>k;
    cout << josephus(n,k); 
    return 0; 
} 