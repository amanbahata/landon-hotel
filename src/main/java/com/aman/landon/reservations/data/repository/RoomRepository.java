package com.aman.landon.reservations.data.repository;

import com.aman.landon.reservations.data.entity.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends MongoRepository<Room, Long> {
}
