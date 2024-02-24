// Write a program  to Implement Shift Reduce parsing for a String.

#include <iostream>
#include <stack>
#include <string>

using namespace std;

// Define constants for symbols
const char TERMINAL_A = 'a';
const char TERMINAL_B = 'b';
const char NON_TERMINAL_S = 'S';
const char END_MARKER = '$';

bool isTerminal(char symbol) {
    return (symbol == TERMINAL_A || symbol == TERMINAL_B);
}

bool shift(stack<char>& st, const string& input, int& index) {
    st.push(input[index++]);
    cout << "Shift operation\n";
    return true;
}

bool reduce(stack<char>& st) {
    // Check if the top of the stack matches a production rule
    if (st.size() >= 3 && st.top() == TERMINAL_B) {
        st.pop(); // Pop 'b'
        st.pop(); // Pop 'S'
        st.pop(); // Pop 'a'
        st.push(NON_TERMINAL_S); // Push 'S' to indicate a reduction
        cout << "Reduce operation\n";
        return true;
    }
    return false;
}

bool parse(const string& input) {
    stack<char> st;
    int index = 0;

    while (index < input.size()) {
        // Try reduce first, then shift
        if (!(reduce(st) || shift(st, input, index))) {
            cout << "Parsing failed\n";
            return false;
        }
    }

    // Continue reducing until the stack contains only the start symbol
    while (st.size() > 1) {
        if (!reduce(st)) {
            cout << "Parsing failed\n";
            return false;
        }
    }

    cout << "Parsing successful\n";
    return true;
}

int main() {
    string input;
    cout << "Enter the input string: ";
    cin >> input;

    // Add end marker to the input
    input += END_MARKER;

    if (parse(input)) {
        cout << "String accepted\n";
    } else {
        cout << "String rejected\n";
    }

    return 0;
}