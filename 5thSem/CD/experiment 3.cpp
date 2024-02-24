// Write a program to check whether a string belong to the grammar or not.

#include <iostream>
#include <string>
#include <cctype>

using namespace std;

bool isValidString(const string &str)
{
    bool hasSpecialChar = false;
    bool hasUppercase = false;
    bool hasLowercase = false;
    bool hasDigit = false;

    for (char c : str)
    {
        if (isupper(c))
        {
            hasUppercase = true;
        }

        else if (islower(c))
        {
            hasLowercase = true;
        }

        else if (isdigit(c))
        {
            hasDigit = true;
        }

        else
        {
            hasSpecialChar = true;
        }
    }

    return hasSpecialChar && hasUppercase && hasLowercase && hasDigit;
}

int main()
{
    string inputString;

    cout << "Enter a string: ";
    getline(cin, inputString); // Allowing spaces in the input string

    if (isValidString(inputString))
    {
        cout << "The string confirms to the grammar." << endl;
    }
    else
    {
        cout << "The string does not confirm to the grammar." << endl;
    }

    return 0;
}
