#include <stdio.h>
#include <stdlib.h>

struct node 
{
    int data;
    struct node *link;
};

struct node *top = NULL;

void push(int value)
{
    struct node *temp;
    temp = (struct node *)malloc(sizeof(struct node));

    temp->data = value;
    temp->link = top;
    top = temp;

    if (top == NULL) {
        top = temp;
    } else {
        
    }
}