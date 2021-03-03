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
void final_list(struct Node **head)
{
            struct Node *temp;
            temp=*head;
            while(temp!=NULL)
            {
                cout<<temp->data<<" ";
                temp=temp->next;
            }
}
void delete_element(struct Node **head)
{
        struct Node *temp,*prev;
        prev=*head;
        temp=prev->next;
        if(prev->next->next==NULL)
        {
           *head=prev->next;
           free(prev);
        }
        else
        {
        while(temp->next->next)
        {
            temp=temp->next;
            prev=prev->next;
        }
        prev->next=temp->next;
        free(temp);
        }
        final_list(head);
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
  if(head==NULL || head->next==NULL)
  {
      cout<<"Deletion of second last element is not possible";
      exit(1);
  }
  else
  {
    delete_element(&head); 
  }
  return 0;
}