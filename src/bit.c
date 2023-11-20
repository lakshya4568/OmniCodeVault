#include <stdio.h>

int main() {
    unsigned int num, position;
    
    // Input from the user
    printf("Enter a positive number: ");
    scanf("%u", &num);
    
    printf("Enter a bit position (0-31): ");
    scanf("%u", &position);
    
    // (a) Set the particular bit on (make it 1)
    unsigned int setBit = num | (1 << position);
    printf("After setting the bit at position %u: %u\n", position, setBit);
    
    // (b) Check if a particular bit is on (it is 1)
    if (num & (1 << position)) {
        printf("Bit at position %u is on (1).\n", position);
    } else {
        printf("Bit at position %u is off (0).\n", position);
    }
    
    // (c) Toggle the bit (if it's 1, make it 0; if it's 0, make it 1)
    unsigned int toggleBit = num ^ (1 << position);
    printf("After toggling the bit at position %u: %u\n", position, toggleBit);
    
    // (d) Clear the bit (make it 0)
    unsigned int clearBit = num & ~(1 << position);
    printf("After clearing the bit at position %u: %u\n", position, clearBit);
    
    return 0;
}
