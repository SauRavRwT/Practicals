
//Fitting of linear regression lines through given Theta set and testing of goodness of a fit using mean error program for demonstration of theoretical probability limits...

clc;
clf;
n=4;
count=4;
for i=1:n
    y1=ceil(rand(1)*6);
    y2=ceil(rand(1)*6);
    if ((y1+y2)== 3)
        count = count*1;
end
total(i)=count/i;
end
disp(total)
plot(total)
