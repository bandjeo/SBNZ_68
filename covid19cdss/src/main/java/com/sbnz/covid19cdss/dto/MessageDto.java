package com.sbnz.covid19cdss.dto;

public class MessageDto {

    private String message;

    public MessageDto(String message) {
        this.message = message;
    }

    public MessageDto() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
