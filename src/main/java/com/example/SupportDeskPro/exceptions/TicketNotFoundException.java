package com.example.SupportDeskPro.exceptions;

public class TicketNotFoundException extends RuntimeException  {

    public TicketNotFoundException(String message) {
        super(message);
    }

}
