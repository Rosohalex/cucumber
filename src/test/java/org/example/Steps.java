package org.example;

import io.cucumber.java.en.*;

public class Steps {

    @Given("I have a calculator")
    public void Calculating(){
        System.out.println("calc");
    }

    @When("I divide 6 by 3")
    public void test() {
        System.out.println("sss");
    }

    @Then("the result should be 2")
    public void check() {
        System.out.println("ddd");
    }

}
