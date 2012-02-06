#include <stdio.h>
#include <stdlib.h>

int test();

int main() {
    int i = 0;
    while(1) {
        printf("%d\n", test(i++));
        sleep(1);
    }
    return 0;
}

int test(int i) {
    return i;
}

