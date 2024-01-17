package com.aero.aviasale.expection;

import org.springframework.http.HttpStatus;

public class BookingFailedException extends CustomException {
    public BookingFailedException(String msg, HttpStatus httpStatus) {
        super(msg, httpStatus);
    }
}
