package com.app.backend.Controller;

import java.math.BigDecimal;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.app.backend.Entity.Room;
import com.app.backend.Response.RoomResponse;
import com.app.backend.Service.IRoomService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RoomController {
    private IRoomService roomService;

    public ResponseEntity<RoomResponse> addNewRoom(@RequestParam("photo") MultipartFile photo,
            @RequestParam("roomType") String roomType,
            @RequestParam("roomPrice") BigDecimal roomPrice) {
        Room savedRoom = roomService.addNewRoom(photo, roomType, roomPrice);
        RoomResponse response = new RoomResponse(savedRoom.getRoom_id(), savedRoom.getRoomType(),
                savedRoom.getRoomPrice());

        return ResponseEntity.ok(response);
    }
}
