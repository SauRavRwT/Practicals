//to find average of 10 numbers...
clc;
disp("Saurav Rawat")
numbers = zeros(1, 10);

disp("Enter 10 numbers:")
for i = 1:10
    numbers(i) = input("Number " + string(i) + ": ");
end

average = mean(numbers);
disp("The average is: " + string(average));
