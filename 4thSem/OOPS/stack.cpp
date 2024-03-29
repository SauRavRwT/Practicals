#include <iostream>
#define size 9
using namespace std;
class STACK
{
    private:
        int num[size];
        int top;
    public:
        STACK();
        int push(int);
        int pop();
        int isEmpty();
        int isFull();
        void displayItems();
};
STACK :: STACK()
{
    top =  -1;
}
int STACK :: isEmpty()
{
    if(top == -1)
        return 1;
    else
        return 0;
}
int STACK :: isFull()
{
    if(top == (size - 1))
        return 1;
    else
        return 0;
}
int STACK::push(int n)
{
    if(isFull())
{
    return 0;
}   ++top;
        num[top] =n;
    return n;
}
int STACK :: pop()
{
    int temp;
    if(isEmpty())
        return 0;
    temp = num[top];
    --top;
        return temp;
}
void STACK :: displayItems()
{
    int i;
    cout << "STACK is : ";
        for(i = (top); i>=0; i--)
            cout << num[i] << "";
            cout << endl;
}

int main()
{
    STACK stk;
    int choice, n, temp;
    do
{   cout << endl;
        cout << "0 - Exit." << endl;
        cout << "1 - Push Item." << endl;
        cout << "2 - Pop Item." << endl;
        cout << "3 - Display Items." << endl;
        cout << "\nEnter your choice: ";
            cin >> choice;

    switch(choice)
{
    case 0: break;

    case 1:
        cout << "Enter item to insert: ";
        cin>>n;
        temp = stk.push(n);
    if(temp == 0)
        cout << "STACK is Full." << endl;
    else
        cout << temp << "inserted" << endl;
    break;

    case 2:
        temp == stk.pop();
    if(temp == 0)
        cout << "STACK is Empty." << endl;
    else
        cout << temp << "is removed (popped)." << endl;
    break;
    
    case 3:
        stk.displayItems();
    break;
    default:
        cout << "An Invalid Choice." << endl;
        }
    }   while(choice != 0);
    cout << "Saurav Rawat" << endl;
    return 0;
}