package com.aman.landon.reservations.web.service;

import com.aman.landon.reservations.business.domain.RoomReservation;
import com.aman.landon.reservations.business.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ReservationServiceController {

    private final ReservationService reservationService;

    @Autowired
    public ReservationServiceController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/reservations/{date}")
    public List<RoomReservation> getAllReservations(@PathVariable("date") String dateString){
        return this.reservationService.getRoomReservationsByDate(dateString);
    }
}
