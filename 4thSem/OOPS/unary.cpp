#include <iostream>
using namespace std;

class Distance {
    public:

//Member Object
int feet, inch;

//Constructor to initialize the object's value
Distance(int f, int i)
{
    this->feet = f;
    this->inch = i;         }

//Overloading(-) operator to perform decrement
//Operation of distance object
void operator-()
{
    feet--;
    inch--;
    cout <<"\nFeet and Inches(Decrement): " << feet << "'" << inch;
}       };

//Driver code
int main()
{
    //Declare and Initialize the constructor
    Distance d1(5,6);

    //Use(-) unary operator by single operand
    -d1;
    cout<<"\nSaurav Rawat\n"<<endl;
    return 0;
}