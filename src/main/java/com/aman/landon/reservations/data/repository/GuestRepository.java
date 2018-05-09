package com.aman.landon.reservations.data.repository;

import com.aman.landon.reservations.data.entity.Guest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends MongoRepository<Guest, Long>{

}
