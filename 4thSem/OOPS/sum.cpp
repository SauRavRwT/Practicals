#include<iostream>

using namespace std;

void sum(int a = 10, int b = 10, int c = 10){
	int d;
	
	d = a+b+c;
	
	cout<<"sum : "<< d ;
}
int main(){
	cout<<"I am in main function."<<endl;
	
	sum(10,20,30);
	cout<<endl;
	cout<<endl;
	cout<<"Saurav Rawat"<<endl;
}

