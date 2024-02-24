
//fitting of a poison distribution forgiven value of Lambda 
clc;
clear;
// Define the lambda parameter
lambda = 2.5;

// Calculate the probability mass function (PMF)
function pmf = poisson_pmf(k, lambda)
    pmf = (exp(-lambda) * lambda^k) / factorial(k);
endfunction

// Calculate the cumulative distribution function (CDF)
function cdf = poisson_cdf(k, lambda)
    cdf = sum(poisson_pmf(0:k, lambda));
endfunction

// Calculate the probability of P(X = k)
k = 3;
pmf_k = poisson_pmf(k, lambda);
disp("P(X = " + string(k) + "): " + string(pmf_k));

// Calculate the probability of P(X <= k)
k = 4;
cdf_k = poisson_cdf(k, lambda);
disp("P(X <= " + string(k) + "): " + string(cdf_k));

// Calculate the mean and variance of the distribution
mean_val = lambda;
variance_val = lambda;
disp("Mean: " + string(mean_val));
disp("Variance: " + string(variance_val));

