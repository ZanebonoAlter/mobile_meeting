package org.bumblebee.entity;

import java.util.Date;

public class Room {
    private Integer roomId;

    private String roomName;

    private String roomState;

    private Integer roomCreateId;

    private Date roomCreateTime;

    private Integer roomLimit;

    private String roomPassword;

    private Integer currentUser;

    public Integer getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(Integer currentUser) {
        this.currentUser = currentUser;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName == null ? null : roomName.trim();
    }

    public String getRoomState() {
        return roomState;
    }

    public void setRoomState(String roomState) {
        this.roomState = roomState == null ? null : roomState.trim();
    }

    public Integer getRoomCreateId() {
        return roomCreateId;
    }

    public void setRoomCreateId(Integer roomCreateId) {
        this.roomCreateId = roomCreateId;
    }

    public Date getRoomCreateTime() {
        return roomCreateTime;
    }

    public void setRoomCreateTime(Date roomCreateTime) {
        this.roomCreateTime = roomCreateTime;
    }

    public Integer getRoomLimit() {
        return roomLimit;
    }

    public void setRoomLimit(Integer roomLimit) {
        this.roomLimit = roomLimit;
    }

    public String getRoomPassword() {
        return roomPassword;
    }

    public void setRoomPassword(String roomPassword) {
        this.roomPassword = roomPassword == null ? null : roomPassword.trim();
    }
}