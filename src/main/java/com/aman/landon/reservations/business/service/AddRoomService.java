package com.aman.landon.reservations.business.service;

import com.aman.landon.reservations.data.entity.Room;
import com.aman.landon.reservations.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddRoomService {

    private RoomRepository roomRepository;

    @Autowired
    public AddRoomService(RoomRepository roomRepository){
        this.roomRepository = roomRepository;
    }

    public void addRoom(Room room){
        roomRepository.save(room);
    }
}
