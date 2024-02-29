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
        while(p->link != NULL)
        {
            p = p->link;
        }
        p->link = temp;
    }
}

void delete () 
{
    struct node *temp;
    int loc;
    printf("Enter the location to delete : ");
    scanf("%d", &loc);

    if (loc > length())
    {
        printf("Invalid location.\n");
    }
    else if (loc == 1)
    {
        temp = root;
        root = temp->link;
        temp->link = NULL;
        free(temp);
    }
    else 
    {
        struct node *p = root, *q;
        int i = 1;
        while(i < loc - 1)
        {
            p = p->link;
            i++;
        }
        q = p->link;
        p->link = q->link;
        q->link = NULL;
        free(q);
    }
}

int length()
{
    int count = 0;
    struct node *temp;
    temp = root;
    while(temp != NULL)
    {
        count++;
        temp = temp->link;
    }
    return count;
}

void display()
{

    struct node *p;
    p = root;
    while(p != NULL)
    {
        printf("[%d|%u] --> ", p->data, p->link);
        p = p->link;
    }
    printf("\n This linked list having %d nodes.\n", length());
}

void insertSorted()
{
    struct node *temp;
    temp = (struct node *)malloc(sizeof(struct node));
    printf("Enter the node value : ");
    scanf("%d", &temp->data);
    temp->link = NULL;

    if (root == NULL) root = temp;
    else 
    {
        struct node *p = root, *q = NULL;
        while(p != NULL && p->data < temp->data)
        {
            q = p;
            p = p->link;
        }
        if (q == NULL)
        {
            temp->link = root;
            root = temp;
        }
        else 
        {
            temp->link = q->link;
            q->link = temp;
        }
    }
}



int main() {

    append();
    append();
    append();

    display();
    
    return 0;
}