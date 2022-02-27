@author Ahmad Tarek
// A complete working C program
// to demonstrate deletion in
// singly linked list
#include <stdio.h>
#include <stdlib.h>
// A linked list node
typedef struct Node
{
// StackEntery data;
int data;
struct Node* next;
}NODE;
//Global Pointer to NODE struct
NODE* head = NULL;
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
int main()
{
// StackEntery data;
int data;
// insertNode(data);
insertNode(7);
insertNode(1);
insertNode(3);
insertNode(2);


// removeNode(data);
removeNode(3);
return 0;
}
