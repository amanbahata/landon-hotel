package com.aman.landon.reservations.data.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.sql.Date;

@Document
public class Reservation {


    @Id
    private String id;
    private long roomId;
    private long guestId;
    private Date date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public long getGuestId() {
        return guestId;
    }

    public void setGuestId(long guestId) {
        this.guestId = guestId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
