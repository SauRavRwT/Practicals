
clc;
clear;
disp("Saurav Rawat")
n=input("Enter the number of terms: ")
a=0;
b=1;
disp(a);
disp(b);
for i=1:n-2
    c=a+b
    disp(c)
    a=b
    b=c
end
