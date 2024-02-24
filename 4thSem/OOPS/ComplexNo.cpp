//Complex Numbers
#include <iostream>
using namespace std;

class Complex  {
    //Declaring Variable
public:
    int Real,Imaginary;
    //Constructor to accept
    //Real and Imaginary part
    Complex(int tempReal = 0, int tempImaginary = 0)
{
    Real = tempReal;
    Imaginary = tempImaginary;
}
//Defining addComp() method
//for adding two Complex Number
Complex addComp(Complex C1, Complex C2)
{
    //Creating temporary Variable
    Complex temp;

//adding Real part of Complex Number
temp.Real = C1.Real + C2.Real;

//addding Imaginary part of Complex Number
temp.Imaginary = C1.Imaginary + C2.Imaginary;

//Returning the Sum
return temp;
      }
};
//Main Class
int main()
{
//First Complex Number
    Complex C1(3,2);
//Printing first Complex Number
    cout<<"Complex Number One: "<< C1.Real
        <<" + i"<< C1.Imaginary<<endl;
//Second Complex Number
    Complex C2(9,5);
//Printing Secong Complex Number
    cout<<"Complex Number Two: "<< C2.Real
        <<" + i"<< C2.Imaginary<<endl;
//for storing the sum
    Complex C3;
//Calling addComp() method
    C3 = C3.addComp(C1, C2);
//printing the sum
    cout<<"Sum of the Complex Numbers: "<<C3.Real<<" + i"<<C3.Imaginary;
    cout<<"\nSaurav Rawat"<<endl;
return 0;
}