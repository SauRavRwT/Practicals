#include <iostream>
using namespace std;

class Student {
    int rn, fee;
    char name[10];

    public:
    Student()
{
    cout << "Enter the Roll Number: ";
        cin >> rn;
    cout << "Enter the Name: ";
        cin >> name;
    cout << "Enter the Fee: ";
        cin >> fee;
}
void display()
{
    cout << endl << rn << "\t" << name << "\t" << fee << endl;
}   };
int main()
{
Student a;
    cout << "\n" << endl;
return 0;
}