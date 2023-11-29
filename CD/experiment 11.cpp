// Write a program to check whether a grammar is operator precedent.

#include <iostream>
#include <unordered_set>
#include <stack>

using namespace std;

// Function to check whether the grammar is operator precedent
bool isOperatorPrecedent(const string &grammar)
{
    // Set of terminals
    unordered_set<char> terminals = {'+', '-', '*', '/'};

    // Set of non-terminals
    unordered_set<char> nonTerminals;
    for (char ch : grammar)
    {
        if (!isalnum(ch) && ch != ' ' && terminals.find(ch) == terminals.end())
        {
            nonTerminals.insert(ch);
        }
    }

    // Stack to maintain precedence order
    stack<char> precedenceStack;

    // Iterate through the grammar
    for (char ch : grammar)
    {
        if (isalnum(ch) || ch == ' ')
        {
            continue; // Ignore operands and spaces
        }
        else if (terminals.find(ch) != terminals.end())
        {
            // If the symbol is a terminal, push it onto the stack
            precedenceStack.push(ch);
        }
        else if (nonTerminals.find(ch) != nonTerminals.end())
        {
            // If the symbol is a non-terminal, pop symbols from the stack until a lower-precedence
            // operator or an equal-precedence operator is encountered
            while (!precedenceStack.empty() && precedenceStack.top() != '(' && ch < precedenceStack.top())
            {
                precedenceStack.pop();
            }
            // Push the non-terminal onto the stack
            precedenceStack.push(ch);
        }
        else if (ch == '(')
        {
            // Push an open parenthesis onto the stack
            precedenceStack.push(ch);
        }
        else if (ch == ')')
        {
            // Pop symbols from the stack until an open parenthesis is encountered
            while (!precedenceStack.empty() && precedenceStack.top() != '(')
            {
                precedenceStack.pop();
            }
            // Pop the open parenthesis
            if (!precedenceStack.empty())
            {
                precedenceStack.pop();
            }
            else
            {
                // Mismatched parentheses
                return false;
            }
        }
    }

    // The grammar is operator precedent if the stack is empty
    return precedenceStack.empty();
}

int main()
{
    cout << "Enter the grammar: ";
    string grammar;
    getline(cin, grammar);

    if (isOperatorPrecedent(grammar))
    {
        cout << "The grammar is operator precedent." << endl;
    }
    else
    {
        cout << "The grammar is not operator precedent." << endl;
    }

    return 0;
}