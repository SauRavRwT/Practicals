#include <iostream>
using namespace std;

int main()
{
    char str[20], *ptr;
    int len=0;

    cout << "Enter the string: ";
    gets(str);
    ptr = &str[0];

    while(*ptr)
    {   len++;
        ptr++;
    }
        cout << "\nLength: " << len;
        cout << endl;
        cout << "Vishal Kumar" << endl;
return 0;
}