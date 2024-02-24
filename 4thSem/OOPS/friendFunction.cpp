#include <iostream>
using namespace std;

class m2;
class m1
{
	int x;

public:
	void getvalue()
	{
		cout << "Enter value of x : ";
		cin >> x;
	}
	friend void multiply(m1, m2);
};
class m2
{
	int y;

public:
	void getvalue()
	{
		cout << "Enter value of y : ";
		cin >> y;
	}

	friend void multiply(m1, m2);
};
void multiply(m1 a, m2 b)
{
	int multi;
	multi = a.x * b.y;
	cout << "Multiplication : " << multi << endl;
}
int main()
{
	m1 a;
	a.getvalue();
	m2 b;
	b.getvalue();
	multiply(a, b);
	cout << endl;
	cout << endl;
	cout << "Saurav Rawat" << endl;
	return 0;
}
