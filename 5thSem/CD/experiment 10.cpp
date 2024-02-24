// Write a program to find out the FIRST of the Non‐terminals in a grammar.

#include<bits/stdc++.h>
using namespace std;
int n;
char productionSet[10][10];
 
void FIRST(set<char> &result,char c)
{
    if(!(isupper(c)))
    {
        result.insert(c);
        return;
    }
    for(int i=0;i<n;i++)
    {   
        if(productionSet[i][0]==c)
        {
          FIRST(result,productionSet[i][2]);
        }
    }
}
int main()
{
    cin>>n;
    //char result[20];
    set<char> s;
    for(int i=0;i<n;i++)
    {
        cin>>productionSet[i];
        s.insert(productionSet[i][0]);
    }
    for(auto c : s)
    {
        set<char> result;
        FIRST(result,c);
        cout<<"First ("<<c<<") : {  ";
        for(auto x : result)
        {
            cout<<x<<"  ";
        }
        cout<<" } \n";
    }
}