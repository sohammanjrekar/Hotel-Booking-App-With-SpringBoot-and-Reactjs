package com.app.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.backend.Entity.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {

}
