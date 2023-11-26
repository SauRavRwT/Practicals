
//Fitting a binomial distribution after computing mean and variance 

clc;
clear;
n=4;
X=[0 1 2 3 4]
F=[5 29 36 25 5]
disp("number of heads ", X)
disp("frequency ", F)
c=X*F'
disp("Product of product of numbers of heads and frequency: ", c)
D=sum(F);
disp("Sum of frequency: ", D)
men=X*F'/sum(F);
disp("mean", men)
p=men/n;
disp("probability of success: ", p)
q=1-p;
disp("probability of failure: ", q)
x=binomial(p,n)
disp("p(X) probability of polynomial distribution when r=0,1,2,3,4")
y=round(100 *x)
disp("p(X) probability of polynomial distribution when r=0,1,2,3,4")
plot(0:n,y)
