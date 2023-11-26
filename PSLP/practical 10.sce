//Fitting a normal distribution when parameter are given...

clc;
clear;
mu = 2.5;   // Given mean
sigma = 1.3;   // Given standard deviation

// Define the range of x values
x = linspace(mu - 4 * sigma, mu + 4 * sigma, 100);

// Calculate the PDF values for the given parameters
pdf = exp(-(x - mu).^2 / (2 * sigma^2)) / (sqrt(2 * %pi) * sigma);

// Plot the normal distribution
plot(x, pdf, 'b', 'LineWidth', 2);
xlabel('x');
ylabel('PDF');
title('Normal Distribution Fit');
