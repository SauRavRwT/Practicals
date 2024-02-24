
//two classify odd and even numbers upto a limit...

clc;
disp("Ravita")
limit = input("Enter the limit: ");
evenNumbers = [];
oddNumbers = [];

for i = 1:limit
    if modulo(i, 2) == 0 then
        evenNumbers = [evenNumbers, i];
    else
        oddNumbers = [oddNumbers, i];
    end
end

disp("Even numbers:");
disp(evenNumbers);

disp("Odd numbers:");
disp(oddNumbers);
