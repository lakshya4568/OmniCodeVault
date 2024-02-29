#include <stdio.h>
#include <stdlib.h>

// write all the functions for double linked list
// 1. append
// 2. add at begin
// 3. add at after
// 4. length
// 5. display

struct node
{
    int data;
    struct node *prev;
    struct node *next;
};

struct node *root = NULL;

void append()
{
    struct node *temp;
    temp = (struct node *)malloc(sizeof(struct node));

    printf("Enter the node value : ");
    scanf("%d", &temp->data);
    temp->prev = NULL;
    temp->next = NULL;

    if (root == NULL)
    {
        root = temp;
    }
    else
    {
        struct node *p;
        p = root;
        while (p->next != NULL)
        {
            p = p->next;
        }
        p->next = temp;
        temp->prev = p;
    }
}

int length()
{
    struct node *temp;
    int count = 0;
    temp = root;
    while (temp != NULL)
    {
        count++;
        temp = temp->next;
    }
    return count;
}

void display()
{
    struct node *temp;
    temp = root;
    while (temp != NULL)
    {
        printf("[%u|%d|%u] --> ", temp->prev, temp->data, temp->next);
        temp = temp->next;
    }
    printf("\n This linked list having %d nodes.\n", length());
}

void addBegin()
{
    struct node *temp;
    temp = (struct node *)malloc(sizeof(struct node));
    printf("Enter the node value : ");
    scanf("%d", &temp->data);
    temp->prev = NULL;
    temp->next = NULL;

    if (root == NULL)
    {
        root = temp;
    }
    else
    {
        temp->next = root;
        root->prev = temp;
        root = temp;
    }
}

void addAfter()
{
    struct node *temp, *p;
    int loc, len, i = 1;
    printf("Enter the location : ");
    scanf("%d", &loc);
    len = length();
    if (loc > len)
    {
        printf("Invalid location\n");
        printf("Currently this linked list having %d nodes.\n", len);
    }
    else
    {
        p = root;
        while (i < loc)
        {
            p = p->next;
            i++;
        }
        temp = (struct node *)malloc(sizeof(struct node));
        printf("Enter the node value : ");
        scanf("%d", &temp->data);

        if (p->next == NULL)
        {
            p->next = temp;
            temp->prev = p;
        }
        else
        {
            temp->next = p->next;
            p->next->prev = temp;
            temp->prev = p;
            p->next = temp;
        }
    }
}





int main() {

    int ch;
    while (1)
    {
        printf("1. Append\n");
        printf("2. Add at begin\n");
        printf("3. Display\n");
        printf("4. Length\n");
        printf("5. Quit\n");
        printf("Enter your choice : ");
        scanf("%d", &ch);

        switch (ch)
        {
        case 1:
            append();
            break;
        case 2:
            addBegin();
            break;
        case 3:
            display();
            break;
        case 4:
            printf("Length of the linked list is : %d\n", length());
            break;
        case 5:
            exit(0);
        default:
            printf("Invalid choice\n");
        }
    }

    return 0;
}