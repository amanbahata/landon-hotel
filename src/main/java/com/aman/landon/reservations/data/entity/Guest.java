package com.aman.landon.reservations.data.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Document(collection = "Guest")
public class Guest {

    @Id
    private String id;
    @NotEmpty
    @Field("firstname")
    private String firstName;
    @NotEmpty
    @Field("lastname")
    private String lastName;
    @NotEmpty
    @Field("email")
    private String email;
    @NotEmpty
    @Field("address")
    private String address;
    @NotEmpty
    @Field("country")
    private String country;
    @NotEmpty
    @Field("state")
    private String state;
    @NotEmpty
    @Field("phonenumber")
    private String phoneNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
