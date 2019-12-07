package com.anahita.demo.controller;

import com.anahita.demo.constant.ErrorResponse;
import com.anahita.demo.constant.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice(annotations = RestController.class)
@Slf4j
public class UserAdvice {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorResponse> doSomething(Exception e) {
        log.error("User with id {} is not found",e.getMessage());
        return new ResponseEntity<ErrorResponse>(new ErrorResponse("User with id "+e.getMessage()+" is not found"), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
