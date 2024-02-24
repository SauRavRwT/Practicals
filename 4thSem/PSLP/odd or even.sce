//Check whether the number is odd or even...
clc;
clear;
n=input("Enter a number: ");
if (module(n,2))==0
    disp("Given number is even: ", n);
else
    disp("Given number is odd: ", n)
end
