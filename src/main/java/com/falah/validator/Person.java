package com.falah.validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Person {

    @Size(max = 20, message = "first name max length must 20 character")
    @NotBlank(message = "first name can not blank")
    private String firstName;

    @Size(max = 20, message = "last name max length must 20 character")
    @NotBlank(message = "last name can not blank")
    private String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
