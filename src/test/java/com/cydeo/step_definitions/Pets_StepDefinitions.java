package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;

import java.util.HashSet;
import java.util.List;

public class Pets_StepDefinitions {


    @Then("user should see below pets list")
    public void user_should_see_below_pets_list(List<String> listOfPets) {
        System.out.println("pets = " + listOfPets);

    }

}
