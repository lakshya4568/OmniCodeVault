#include <stdio.h>
#include <stdlib.h>

struct node 
{
    int data;
    struct node *link;
};

struct node *F = NULL;
struct node *R = NULL;

void enqueue(int value)
{
    struct node *temp;
    temp = (struct node *)malloc(sizeof(struct node));
    temp->data = value;
    temp->link = NULL;

    if (F == NULL && R == NULL) {
        F = temp;
        R = temp;
    } else {
        R->link = temp;
        R = temp;
    }
}

void dequeue()
{
    if (F == R)
    {
        F = NULL;
        R = NULL;
    }
    else
    {
        struct node *temp;
        temp = F;
        F = F->link;
        temp->link = NULL;
        free(temp);
    }
}

void display()
{
    struct node *temp;
    temp = F;

    while (temp != NULL)
    {
        printf("%d\n", temp->data);
        temp = temp->link;
    }
}

int main() 
{
    enqueue(1);
    enqueue(2);
    enqueue(3);
    enqueue(4);
    enqueue(5);

    display();
    printf("\n");
    
    dequeue();
    dequeue();

    display();

    return 0;
}