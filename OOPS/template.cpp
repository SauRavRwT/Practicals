#include <iostream>
using namespace std;

template <class T>
T square(T num)
{
    return num * num;
};

int main()
{
    int int_num;
    float float_num;
    cout << "Enter an integer number: \t" << endl;
    cin >> int_num;
    cout << "Squared integer number: \t" << square(int_num) << endl;
    cout << "Enter a floating point number: \t" << endl;
    cin >> float_num;
    cout << "Squared floating-point number: \t" << square(float_num) << endl;
    cout << "Saurav Rawat" << endl;
    return 0;
}