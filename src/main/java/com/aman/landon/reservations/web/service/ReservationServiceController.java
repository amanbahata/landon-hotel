package com.aman.landon.reservations.web.service;

import com.aman.landon.reservations.business.domain.RoomReservation;
import com.aman.landon.reservations.business.service.AddRoomService;
import com.aman.landon.reservations.business.service.ReservationService;
import com.aman.landon.reservations.data.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ReservationServiceController {

    private final ReservationService reservationService;
    private final AddRoomService addRoomService;
    @Autowired
    public ReservationServiceController(ReservationService reservationService, AddRoomService addRoomService) {
        this.reservationService = reservationService;
        this.addRoomService = addRoomService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/reservations/{date}")
    public List<RoomReservation> getAllReservations(@PathVariable("date") String dateString){
        return this.reservationService.getRoomReservationsByDate(dateString);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addroom")
    public ResponseEntity<String> addRoom(@RequestBody Room room){
        if (room != null) {
            Room newRoom = new Room();
            newRoom.setName(room.getName());
            newRoom.setNumber(room.getNumber());
            newRoom.setBedInfo(room.getBedInfo());

            this.addRoomService.addRoom(newRoom);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
        return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
    }
}