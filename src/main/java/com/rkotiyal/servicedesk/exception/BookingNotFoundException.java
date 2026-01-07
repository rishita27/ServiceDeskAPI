package com.rkotiyal.servicedesk.exception;

public class BookingNotFoundException extends RuntimeException{
    public BookingNotFoundException(Long id){
        super("Booking wih id " + id + " not found");
    }
}
