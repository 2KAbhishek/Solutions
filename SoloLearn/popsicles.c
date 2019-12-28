// Evenly disttribute popsicles among siblings.

#include <stdio.h>

int main() {
    int siblings, popsicles;
    scanf("%d", &siblings);
    scanf("%d", &popsicles);

    if (popsicles % siblings){
        printf ("eat them yourself");
    } else {
        printf ("give away");
    }

    return 0;
}
