#include<iostream>
using namespace std;
struct Node
{
  int data;
  struct Node *next;
};
void insert_end(struct Node **head,int key)
{
  struct Node *newnode=(struct Node*)malloc(sizeof(struct Node));
  struct Node *temp=*head;
  newnode->data=key;
  newnode->next=NULL;
  if(*head==NULL)
  {
    *head=newnode;
  }
  else
  {
    while(temp->next)
    {
      temp=temp->next;
    }
    temp->next=newnode;
  }
}
  void print_list(struct Node **head,int k)
    {
        int c=-1,tc=0;
        struct Node *temp,*temp2;
        temp=*head;
        temp2=*head;
        if(temp==NULL)
        {
            tc=0;
        }
        else
        {
            while(temp!=NULL)
            {
                tc+=1;
                temp=temp->next;
            }
        }
        //cout<<tc;
        if(k>tc || k==0)
        {
            cout<<"There is no nth node in the list";
        }
        else
        {
           while(temp2!=NULL)
           {
               c+=1;
               if(tc-c==k)
               {
                   cout<<temp2->data<<" is the nth node element in the list";
                   exit(1);
               }
               temp2=temp2->next;
           }
        }
    }
int main()
{
  struct Node *head=NULL;
  int v,k;
  do
  {
    cin>>v;
    if(v>0)
    {
      insert_end(&head,v);
    }
  }while(v>0);
  cout<<"Enter the nth node:\n";
  cin>>k;
  print_list(&head,k); 
  return 0;
}