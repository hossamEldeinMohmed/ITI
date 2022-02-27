#include<stdio.h>

#include<stdlib.h>

#include <stdio.h>

int MAXSIZE = 8;
char stack[8];
int top = -1;

int isempty() {

   if(top == -1)
      return 1;
   else
      return 0;
}

int isfull() {

   if(top == MAXSIZE)
      return 1;
   else
      return 0;
}

int peek() {
   return stack[top];
}

char pop() {
   char data;

   if(!isempty()) {
      data = stack[top];
      top = top - 1;
      return data;
   } else {
      printf("Could not retrieve data, Stack is empty.\n");
   }
}

void push(char data) {

   if(!isfull()) {
      top = top + 1;
      stack[top] = data;
   } else {
      printf("Could not insert data, Stack is full.\n");
   }
}

void stack_Rev(char * array,int len){
for(int i=0;i<len;i++){
    push(array[i]);

}
for(int i=0;i<len;i++){
   array[i]= pop();

}


}
int main()
{
char a []={'s','d','m'};
stack_Rev(&a,3);
printf("%c",a[0]);

}

