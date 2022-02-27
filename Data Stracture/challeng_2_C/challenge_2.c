#include <stdio.h>
#include <stdlib.h>
// A linked list node
typedef struct Node
{
// StackEntery data;
    int data;
    int kay;
    struct Node* next;
} NODE;
//Global Pointer to NODE struct
NODE* head = NULL;
int kay=0;
void insertNode(int data)
{
//struct node *link = (struct node*) malloc(sizeof(struct node));

if(head==NULL){
    NODE *ptr=( NODE*) malloc(sizeof( NODE));
    ptr->data=data;
    ptr ->next=NULL;
    ptr->kay=kay;
    kay++;
    head=ptr;


    }
    else{
     NODE *c=head;
    while(c->next != NULL)
    {

        c=c->next;
    }

    NODE *ptr=( NODE*) malloc(sizeof( NODE));
    ptr->data=data;
    ptr ->next=NULL;
    ptr->kay=kay;
    kay++;

    c->next=ptr;
}


}
int searchNode(int data)
{
    struct Node* current = NULL;
    int postion = 0;
    if(head == NULL)
        return 0;
    current = head;
    postion = 1;
    while(current != NULL)
    {
        if(current -> data == data)
        {
            return postion;
        }
        current = current -> next;
        postion ++;
    }
    return 0;
}
int listSize()
{
    struct Node* current = NULL;
    int size = 0;
    if(head == NULL)
        return 0;
    current = head;
    size = 1;
    while(current -> next != NULL)
    {
        current=current -> next;
        size++;
    }
    return size;
}
int removeNode(int data)
{
    struct Node* current = NULL;
    struct Node* previous = NULL;
    struct Node* delete = NULL;
    if(head == NULL)
    {
        return 0;
    }
    current = head -> next;
    previous = head;
    if(head -> data == data)
    {
        delete = head;
        head = head -> next;
        free(delete);
        return 1;
    }
    while(current != NULL)
    {
        if(current -> data == data)
        {
            delete = current;
            previous -> next = current -> next;
// incase we have mutiple instances of data.
// current = current -> next -> next;
// ***************** ********************
            free(delete);
            return 1;
        }
        previous = current;
        current = current -> next;
    }
    return 0;

}
int remove_from_back(int n)
{
 n=kay-n;
 if(n==0){
  NODE *c=head;
  head =head->next;
  free(c);
  kay--;
 }
 else if(n>0){
 NODE *c=head;
 NODE *p=head;
    while(c->kay!=n)
    {
        p=c;
        c=c->next;
    }
   p->next=c->next;
   free(c);
   kay--;


   return 1;
}else
return 0;

}
void print()
{
    NODE *c=head;
    while(c!=NULL)
    {
        printf("%d\n",c->data);
        c=c->next;
    }
}

int main()
{
// StackEntery data;
    //int data;
// insertNode(data);
    insertNode(7);

    insertNode(3);

// removeNode(data);

    insertNode(4);
    insertNode(3);
    remove_from_back(4);
    print();
    return 0;
}
