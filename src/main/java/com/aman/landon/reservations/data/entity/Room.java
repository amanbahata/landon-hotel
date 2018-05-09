package com.aman.landon.reservations.data.entity;


import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Document
public class Room {

    @Id
    private String id;
    private String name;
    private String number;
    private String bedInfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBedInfo() {
        return bedInfo;
    }

    public void setBedInfo(String bedInfo) {
        this.bedInfo = bedInfo;
    }
}
