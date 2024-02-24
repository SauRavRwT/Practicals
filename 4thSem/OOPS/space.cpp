#include <iostream>
using namespace std;

void removeSpace(char *str)
{
    int count = 0;
    for (int i = 0; str[i]; i++)
        if (str[i] != ' ')
            str[count++] = str[i];
    str[count] = '\0';
}
int main()
{
    char str[] = "G t b i t S t u d e n t s";
    removeSpace(str);
    cout << str;
    return 0;
}