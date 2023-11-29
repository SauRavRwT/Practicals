// Write a program to find out the leading of the non‐terminals in a grammar.

#include <iostream>
#include <vector>
#include <set>
#include <map>
#include <sstream>
#include <algorithm>

using namespace std;

// Function to compute leading of non-terminals
map<string, set<string>> computeLeading(map<string, vector<string>> productions, string startSymbol)
{
    map<string, set<string>> leading;

    // Initialize leading sets
    for (const auto &production : productions)
    {
        leading[production.first] = set<string>();
    }

    // Add epsilon to the leading of the start symbol
    leading[startSymbol].insert("epsilon");

    // Iterate until there are no changes in leading sets
    bool changes = true;
    while (changes)
    {
        changes = false;

        for (const auto &production : productions)
        {
            const string &nonTerminal = production.first;
            const vector<string> &symbols = production.second;

            for (const string &symbol : symbols)
            {
                // If symbol is a non-terminal
                if (productions.find(symbol) != productions.end())
                {
                    // Add leading of symbol to leading of non-terminal
                    size_t originalSize = leading[nonTerminal].size();
                    leading[nonTerminal].insert(leading[symbol].begin(), leading[symbol].end());
                    size_t newSize = leading[nonTerminal].size();

                    // Check if there were changes
                    if (newSize > originalSize)
                    {
                        changes = true;
                    }
                }
                else
                {
                    // If symbol is a terminal, add it to the leading of non-terminal
                    size_t originalSize = leading[nonTerminal].size();
                    leading[nonTerminal].insert(symbol);
                    size_t newSize = leading[nonTerminal].size();

                    // Check if there were changes
                    if (newSize > originalSize)
                    {
                        changes = true;
                    }

                    // Stop if epsilon is not in the leading of the symbol
                    if (symbol != "epsilon")
                    {
                        break;
                    }
                }
            }
        }
    }

    return leading;
}

int main()
{
    // Example grammar
    map<string, vector<string>> productions;
    productions["S"] = {"a", "B"};
    productions["B"] = {"b", "C", "d"};
    productions["C"] = {"epsilon"};

    // Start symbol
    string startSymbol = "S";

    // Compute leading sets
    map<string, set<string>> leading = computeLeading(productions, startSymbol);

    // Output leading sets
    for (const auto &entry : leading)
    {
        cout << "Leading(" << entry.first << ") : ";
        for (const string &symbol : entry.second)
        {
            cout << symbol << " ";
        }
        cout << endl;
    }

    return 0;
}