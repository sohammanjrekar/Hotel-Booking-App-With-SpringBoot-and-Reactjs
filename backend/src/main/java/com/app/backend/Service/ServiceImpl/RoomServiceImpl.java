package com.app.backend.Service.ServiceImpl;

import java.math.BigDecimal;
import java.sql.Blob;

import javax.sql.rowset.serial.SerialBlob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.app.backend.Entity.Room;
import com.app.backend.Repository.RoomRepository;
import com.app.backend.Service.IRoomService;

public class RoomServiceImpl implements IRoomService {
    @Autowired
    private RoomRepository roomRepository;

    @Override
    public Room addNewRoom(MultipartFile photo, String roomType, BigDecimal roomPrice) {
        Room room = new Room();
        room.setRoomType(roomType);
        room.setRoomPrice(roomPrice);
        if (!file.isEmpty()) {
            byte[] photoBytes = file.getBytes();
            Blob photoBlob = new SerialBlob(photoBytes);
            room.setPhoto(photoBlob);
        }
        return room;
    }

}
