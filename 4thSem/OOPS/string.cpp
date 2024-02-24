#include<iostream>
using namespace std;

int main()
{
    char str[20], *ptr;
    int len = 0;
    cout<<"Enter the string : ";
    gets(str);
    ptr = &str[0];
    while (*ptr)
    {
        len++;
        ptr++;
    }
    cout<<"\nlength = "<<len;
    cout<<endl;
    cout<<"Saurav Rawat"<<endl;
    return 0;
}