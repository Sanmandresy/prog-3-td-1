package app.prog.controller;

import app.prog.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class InternalExceptionHandler extends ResponseEntityExceptionHandler {
  @ExceptionHandler({NotFoundException.class})
  ResponseEntity<Object> handleNotFoundRequest(NotFoundException e) {
    return new ResponseEntity<>(e, HttpStatus.NOT_FOUND);
  }
}
