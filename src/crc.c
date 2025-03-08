#include <stdio.h>
#include <string.h>

int main() {
    int i, j, keylen, msglen;
    char input[100], key[30], temp[30], quot[100], rem[30], key1[30];

    printf("Enter Data: ");
    gets(input); // 'gets' is deprecated, consider using 'fgets'

    printf("Enter Key: ");
    gets(key); // Same here, better to use 'fgets'

    keylen = strlen(key);
    msglen = strlen(input);

    strcpy(key1, key);

    // Append '0's to input
    for (i = 0; i < keylen - 1; i++) {
        input[msglen + i] = '0';
    }
    input[msglen + i] = '\0'; // Null-terminate the string after appending zeros

    // Copy initial bits of input to temp
    for (i = 0; i < keylen; i++) {
        temp[i] = input[i];
    }

    for (i = 0; i < msglen; i++) {
        quot[i] = temp[0]; // Store quotient bits

        if (quot[i] == '0') {
            for (j = 0; j < keylen; j++)
                key[j] = '0'; // XOR with 0
        } else {
            for (j = 0; j < keylen; j++)
                key[j] = key1[j]; // XOR with key
        }

        // Perform XOR and shift
        for (j = keylen - 1; j > 0; j--) {
            if (temp[j] == key[j])
                rem[j - 1] = '0';
            else
                rem[j - 1] = '1';
        }

        rem[keylen - 1] = input[i + keylen]; // Shift next input bit
        strcpy(temp, rem); // Copy remainder back to temp
    }

    strcpy(rem, temp); // Final remainder

    // Output the quotient
    printf("\nQuotient is: ");
    for (i = 0; i < msglen; i++) {
        printf("%c", quot[i]);
    }

    // Output the remainder
    printf("\nRemainder is: ");
    for (i = 0; i < keylen - 1; i++) {
        printf("%c", rem[i]);
    }

    // Final data (input + remainder)
    printf("\nFinal data is: ");
    for (i = 0; i < msglen; i++) {
        printf("%c", input[i]);
    }
    for (i = 0; i < keylen - 1; i++) {
        printf("%c", rem[i]);
    }

    return 0; // Return success
}