#include <iostream>
using namespace std;

int main()
{
    char c;
    cout << "Enter an alphabet : ";
    cin >> c;
    if (c >= 'A' && c <= 'Z')
    {
        c += 32;
        cout << "Alphabet converted to Lowercase: "
             << c;
    }
    else
    {
        cout << "Not in uppercase: ";
    }
    cout << "\nSaurav Rawat\n"
         << endl;
    return 0;
}