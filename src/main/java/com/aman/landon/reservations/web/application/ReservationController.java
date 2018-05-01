package com.aman.landon.reservations.web.application;

import com.aman.landon.reservations.business.domain.RoomReservation;
import com.aman.landon.reservations.business.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/reservations")
public class ReservationController {


    private final ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getReservations(@RequestParam(value = "date", required = false) String dateString, Model model){

        List<RoomReservation> roomReservationsList = this.reservationService.getRoomReservationsByDate(dateString);
        model.addAttribute("roomReservations", roomReservationsList);
        return "reservations";
    }
}
