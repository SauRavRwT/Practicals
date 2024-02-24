
clc;
disp("Saurav Rawat")
disp("Sum of tossing two dice is 3")
title("Sum of tossing two dice is 3")
n=1000;
count=0;
for i=1:n
    y1=ceil(rand(1)*6);
    y2=ceil(rand(1)*6);
    if ((y1+y2)==3)
        count = count +i;
end
prob(i)=count/i;
end
disp(prob)
plot2d(prob)


disp("Sum of tossing two dice is 6")
title("Sum of tossing two dice is 6")
n=1000;
count=0;
for i=1:n
    y1=ceil(rand(1)*6);
    y2=ceil(rand(1)*6);
    if ((y1+y2)== 6)
        count = count +i;
end
prob(i)=count/i;
end
disp(prob)
plot2d(prob)
