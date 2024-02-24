// Write a program to check whether a string include Keyword or not.

#include <iostream>
#include <regex>
#include <string>
using namespace std;

int main()
{
    string input_string;
    string keyword;

    // Input string from the user
    cout << "Enter a string (enclosed in double quotes): ";
    getline(cin, input_string);

    // Remove double quotes from the string
    input_string = input_string.substr(1, input_string.length() - 2);

    // Get the keyword from the user
    cout << "Enter the keyword: ";
    cin >> keyword;

    // Define a regular expression pattern to match the keyword
    regex pattern(keyword);

    // Check if the keyword is found in the input string
    if (regex_search(input_string, pattern))
    {
        cout << "The input string '" << input_string << "' contains the keyword '" << keyword << "' " << endl;
    }
    else
    {
        cout << "The input string '" << input_string << "' does not contain the keyword '" << keyword << "'" << endl;
    }
    return 0;
}
