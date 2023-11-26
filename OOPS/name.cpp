#include <iostream>
#nclude < fstream>
using namespace std;
// #include<conio.h>
class student_info
{
    char name[20];
    int age;
    char sex;
    float height;
    float weight;

public:
    void read();
    void write();
};
void student_info::read()
{
    Cout << "\nEnter Name: ";
    cin >> name;
    cout << "\nEnter Age: ";
    cin >> age;
    cout << "\nEnter Gender (F/M): ";
    cin >> sex;
    cout << "\nEnter Height: ";
    cin > height;
    cout << "\nEnter Weight (kilogram): ";
    cin >> weight;
}
void student_info::write()
{
    cout << "\nName: " << name << "\nAge" << age << "\nGender: " << sex << "\nHeight: " << height << "\nWeight: " << weight << "\nkg";
}
int main()
{
    int n;
    cout << "Enter how any records are to be started: ";
    cin >> n;
    student_info s[n];
    ofstream fout;
    cin >> n;
    student_info s[n];
    ofstream fout;
    fout.open("data.txt");
    for (int i = 0; i < n; i++)
    {
        s[i].read();
        fout.write((char *)&s[i], sizeof(s[i]));
    }
    fout.close();
    ifstream fin;
    cout << "..........................DISPLAYING THE CUNTENTS U THE FMLE..........................\n"
         << endl;
    fin.open("data.txt");
    for (int i = 0; i < n; i++)
    {
        while (fin.read((char *)&s[i], sizeof(s[i])))
        {
            s[i].write();
        }
    }
    fin.close();
    return 0;
}