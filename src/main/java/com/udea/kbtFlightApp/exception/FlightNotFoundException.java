package com.udea.kbtFlightApp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FlightNotFoundException extends RuntimeException {

  public FlightNotFoundException(String mensaje) {

    super(mensaje);

  }
}

