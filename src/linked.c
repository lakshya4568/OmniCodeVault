#include <stdio.h>
#include <stdlib.h>

struct node 
{
    int data;
    struct node *link;
};

struct node *root = NULL;

void append () 
{
    struct node *temp;
    temp = (struct node *)malloc(sizeof(struct node));

    printf("Enter the node value : ");
    scanf("%d", &temp->data);
    temp->link = NULL;

    if (root == NULL) root = temp;
    else 
    {
        struct node *p;
        p = root;
        while(p != NULL)
        {
            p = p->link;
        }
        p->link = temp;
    }
}

void display()
{
    int count = 0;
    struct node *p;
    p = root;
    while(p != NULL)
    {
        printf("[%d|%u] --> ", p->data, p->link);
        p = p->link;
    }
    printf("\n This linked list having %d nodes.\n", count);
}

int main() {

    append();
    append();
    append();
    
    return 0;
}