#include<iostream> 
using namespace std; 
int findMissingUtil(int arr[], int low, 
						int high, int diff) 
{ 
	int mid = low + (high - low) / 2; 
	if (arr[mid + 1] - arr[mid] != diff) 
		return (arr[mid] + diff); 
	if (mid > 0 && arr[mid] - arr[mid - 1] != diff) 
		return (arr[mid - 1] + diff); 
	if (arr[mid] == arr[0] + mid * diff) 
		return findMissingUtil(arr, mid + 1,high, diff); 
	return findMissingUtil(arr, low, mid - 1, diff); 
} 
	 
	
int main() 
{  
	int n;
   cin>>n;
   int arr[n];
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  int diff = (arr[n - 1] - arr[0]) / (n-1);
  cout<<findMissingUtil(arr, 0, n - 1, diff);  
	return 0; 
} 
