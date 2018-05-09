package com.aman.landon.reservations.data.repository;

import com.aman.landon.reservations.data.entity.Guest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface GuestRepository extends MongoRepository<Guest, Long>{
    //    Guest guest = this.guestRepository.findById(reservation.getGuestId()).orElse(null);
    Optional<Guest> findById(String aLong);
}
