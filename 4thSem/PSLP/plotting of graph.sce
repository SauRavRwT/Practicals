//plotting of graph...
clc;
clear;
disp("Saurav Rawat")
x=0:0.01:1;
y1=1./cos(x);
y2=1./sin(x);
clf();
subplot(2,1,1);
plot(x,y1,'*');
xlabel("x");
ylabel("sec(x)");
title("Graph of Sec(x)");
subplot(2,1,2);
plot(x,y2,'*');
xlabel("x");
ylabel("cosec(x)");
title("Graph of cosec(x)");
