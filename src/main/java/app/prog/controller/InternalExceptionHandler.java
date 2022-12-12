package app.prog.controller;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class InternalExceptionHandler extends ResponseEntityExceptionHandler {
  @ExceptionHandler({ChangeSetPersister.NotFoundException.class})
  ResponseEntity<Object> handleNotFoundRequest(ChangeSetPersister.NotFoundException e) {
    return new ResponseEntity<>(e, HttpStatus.NOT_FOUND);
  }
}
