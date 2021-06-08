package com.codurance.primes;


import static org.assertj.core.api.Assertions.assertThat;

import io.cucumber.java8.En;

public class StepDefinitions implements En {
  private int number;
  private int[] result;
  private PrimeFactors primeFactors = new PrimeFactors();

  public StepDefinitions() {
    When("I type {int}", (Integer int1) -> {
      number = int1;
    });
    When("I click calculate", () -> {
      result = primeFactors.of(number);
    });
    Then("I get {int}", (Integer int1) -> {
      assertThat(result).contains(int1);
    });

    Then("I get {int}, {int}", (Integer int1, Integer int2) -> {
      assertThat(result).contains(int1, int2);
    });

    Then("I get {int}, {int}, {int}", (Integer int1, Integer int2, Integer int3) -> {
      assertThat(result).contains(int1, int2);
    });
  }
}
