#include <iostream>
using namespace std;
void bin(int arr[],int l,int h,int element)
{
    int mid=(l+h)/2;
	if(l<=h)
	{
	if(arr[mid]==element)
	{
	    cout<<mid;
	}
	if(arr[mid]>element)
	{
	    h=mid-1;
	    bin(arr,l,h,element);
	}
	if(arr[mid]<element)
	{
	    l=mid+1;
	    bin(arr,l,h,element);
	}
	}
	else
	{
	    cout<<"Not found";
	}
}
int main() {
	int  size,element,mid,l=0;
	cin>>size;
	int h=size-1;
	int arr[size];
	for(int i=0;i<size;i++)
	
	{
	    cin>>arr[i];
	}
	cin>>element;
	bin(arr,l,h,element);
	return 0;
}
