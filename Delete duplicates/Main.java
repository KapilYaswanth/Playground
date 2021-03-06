#include<iostream>
using namespace std;
struct Node
{
  int data;
  struct Node *next;
};
int notinlist(struct Node **head,int data)
{
    int ans;
    struct Node *temp=*head;
    if(*head==NULL)
    {
        ans=1;
    }
    else
    {
        while(temp)
        {
            if(temp->data==data)
            {
                ans=0;
                break;
            }
            else
            {
                ans=1;
            }
            temp=temp->next;
        }
    }
    return ans;
}
void append(struct Node **head,int data)
{
  struct Node *node;
  node=(struct Node*)malloc(sizeof(struct Node));
  node->data=data;
  node->next=NULL;
  struct Node *temp=*head;
  if(*head==NULL)
  {
    *head=node;
  }
  else
  {
    while(temp->next!=NULL)
    {
      temp=temp->next;
    }
    temp->next=node;
  }
}
void printlist(struct Node **head)
{
  struct Node *temp=*head;
  while(temp!=NULL)
  {
    cout<<temp->data<<endl;
    temp=temp->next;
  }
}
int main()
{
  struct Node *head=NULL;
  int n;
  do{
      cin>>n;
      if(n>0)
      {
        append(&head,n); 
      }
  }while(n>0);
  cout<<"Linked list before removal of duplicates"<<endl;
  printlist(&head);
  struct Node *temp=head;
  struct Node *head2=NULL;
    while(temp)
    {
      if(notinlist(&head2,temp->data))
      {
        append(&head2,temp->data);
      }
      temp=temp->next;
  }
  cout<<"Linked list after removal of duplicates"<<endl;
  printlist(&head2);
  return 0;
}