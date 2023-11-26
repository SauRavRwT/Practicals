#include <iostream>
using namespace std;

int main()  {

    int x = 10;   //Integer X
    char y = 'a';  //Integer Y

//Y implicitly converted to int. ASCII
//Value of 'a' is 97
x = x + y;

//X is implicitly converted to float
float z = x + 1.0;
cout << "x = " << x << endl;
cout << "y = " << y << endl;
cout << "z = " << z << endl;
cout << "\nSaurav Rawat\n";

return 0;

}