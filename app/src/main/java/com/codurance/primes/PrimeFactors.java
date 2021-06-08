package com.codurance.primes;

public class PrimeFactors {

  public int[] of(int number) {
    int[] primes = new int[number];
    for (int i = 1; i < number; i++){
      if (isPrime(i)){
        primes[i] = i;
      }
    }
    return primes;
  }

  public boolean isPrime(int n) {
    if (n <= 1){
      return false;
    }

    for (int i = 2; i < n; i++){
      if (n % i == 0) {
        return false;
      }
    }

    return true;
  }
}
