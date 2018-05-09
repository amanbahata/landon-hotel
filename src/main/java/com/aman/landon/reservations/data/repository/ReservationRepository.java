package com.aman.landon.reservations.data.repository;

import com.aman.landon.reservations.data.entity.Reservation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ReservationRepository extends MongoRepository<Reservation, Long> {
    List<Reservation> findByDate(Date date);
}
