#include <iostream>
using namespace std;

int main()  {

//Declare a int datatype pointer, Named as Int
int* pointInt;

//Declare a float datatype pointer, Named as Float
float* pointFloat;

//Dynamically allocate memory to data
pointInt = new int;
pointFloat = new float;

//Invoking values to the memory
*pointInt = 45;
*pointFloat = 45.45;

cout << *pointInt << endl;
cout << *pointFloat << endl;
cout<<"Saurav Rawat"<<endl;

//Remove the allocated memory
delete pointInt;
delete pointFloat;

return 0;

}