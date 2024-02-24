#include <iostream>
using namespace std;

class A
{   public:
        A() { cout << "A's constructor called" << endl; 
        }
};
class B
{   static A a;
        public:
            B() { cout << "B's constructor called" << endl;
        }
};

int main()
{
    B b;
    cout<<"\nSaurav Rawat\n"<<endl;
    return 0;
}